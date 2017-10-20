package hotel.booking;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.net.ftp.FTPClient;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import hotel.HttpClientUtil;
import hotel.ImageCompressUtil;
import hotel.excute.BookingImageDwonloadTest;

public class BookingHotelImageDownloadTask implements Runnable {

	Integer start = null;
	Integer count = null;
	String countryCode = "";
	private static final String DIR_SEPARATOR = "/";
	private static final String PATH = "/hotelimage/";
	private static final String LOGO_PATH = "classpath:/logo.jpg";
	private static final String HOST = "127.0.0.1";
	private static final int PORT = 21;
	private static final String USER = "test";
	private static final String PASS = "123";

	public BookingHotelImageDownloadTask(Integer start, Integer count, String countryCode) {
		this.start = start;
		this.count = count;
		this.countryCode = countryCode;
	}

	@Override
	public void run() {
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
		headers.put("User-Agent", "Mozilla/5.0 (Windows NT 6.2; WOW64; rv:44.0) Gecko/20100101 Firefox/44.0");

		List<String> images = new ArrayList<String>();

		try (Connection con = BookingImageDwonloadTest.db.getConnection()) {
			Statement stmt = con.createStatement();
			String query = "select image_id from booking_hotel_image" + countryCode + "  where down is null limit "
					+ start + "," + count;
			ResultSet hotelRs = stmt.executeQuery(query);
			while (hotelRs.next()) {
				String imageId = hotelRs.getString(1);
				images.add(imageId);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		for (String imageId : images) {
			String url = imageId.split("_")[1];
			String downUrl = "http://r-cc.bstatic.com/images/hotel/max1024x768/" + url.substring(0, 3) + "/" + url
					+ ".jpg";
			InputStream inputStream = HttpClientUtil.downloadFile(downUrl);

			if (inputStream != null) {
				try {
					writeFile(inputStream, PATH + url.substring(0, 3) + DIR_SEPARATOR, url + ".jpg");
				} catch (Exception e) {
					continue;
//					throw new RuntimeException(e);
				}
			}

			try (Connection con = BookingImageDwonloadTest.db.getConnection()) {
				PreparedStatement inst = con
						.prepareStatement("update booking_hotel_image" + countryCode + "  set down=1 where image_id=?");
				inst.setString(1, imageId);
				inst.execute();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}

	private void writeFile(InputStream inputStream, String filePath, String fileName) throws Exception {
		boolean ftpFlag = true;

		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource resources = resolver.getResource(LOGO_PATH);
		InputStream logo = resources.getInputStream();
		File file = ImageCompressUtil.compressPic(inputStream, 800, 800, true, logo, null);

		try (InputStream in = new FileInputStream(file)) {
			FTPClient ftpClient = new FTPClient();
			ftpClient.setControlEncoding("GBK");
			ftpClient.connect(HOST, PORT);
			ftpClient.login(USER, PASS);
			ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
			mkdir(ftpClient, filePath);
			ftpFlag = ftpClient.storeFile(fileName, in);
			if (ftpClient.isConnected()) {
				ftpClient.disconnect();
			}
			System.out.println(ftpFlag+"-----"+fileName);
		}
		file.delete();
		if (!ftpFlag) {
			throw new RuntimeException();
		}
		// new File(filePath).mkdirs();
		// File newFile = new File(filePath + "/" + fileName);
		// newFile.createNewFile();
		// fileChannelCopy(file, newFile);
	}

	public void fileChannelCopy(File s, File t) throws Exception {
		FileInputStream fi = null;
		FileOutputStream fo = null;
		FileChannel in = null;
		FileChannel out = null;
		try {
			fi = new FileInputStream(s);
			fo = new FileOutputStream(t);
			in = fi.getChannel();// 得到对应的文件通道
			out = fo.getChannel();// 得到对应的文件通道
			in.transferTo(0, in.size(), out);// 连接两个通道，并且从in通道读取，然后写入out通道
		} finally {
			try {
				if (fi != null) {
					fi.close();
				}
				if (in != null) {
					in.close();
				}
				if (fo != null) {
					fo.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void mkdir(FTPClient ftpClient, String path) throws IOException {
		if (!ftpClient.changeWorkingDirectory(path)) {
			int start = 0;
			int end = 0;
			// 相对路径是否以“/”开头
			if (path.startsWith(DIR_SEPARATOR)) {
				start = 1;
			} else {
				start = 0;
			}
			// 获取从start下标开始出现的第一个"/"的下标
			end = path.indexOf(DIR_SEPARATOR, start);
			while (true) {
				String subDirectory = path.substring(start, end);
				// 当前目录不存在
				if (!ftpClient.changeWorkingDirectory(subDirectory)) {
					// 创建目录成功（makeDirectory创建成功会返回true）
					if (ftpClient.makeDirectory(subDirectory)) {
						// 指向当前新创建的目录
						ftpClient.changeWorkingDirectory(subDirectory);
					} else {
						break;
					}
				}
				// 设置下级目录起始和结束下标
				start = end + 1;
				end = path.indexOf(DIR_SEPARATOR, start);
				// 已是最后一级目录
				if (end <= start) {
					break;
				}
			}
		}
	}

}