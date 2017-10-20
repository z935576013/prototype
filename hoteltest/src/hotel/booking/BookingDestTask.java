package hotel.booking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import hotel.HttpClientUtil;

public class BookingDestTask implements Runnable {
	
	String dburl = "jdbc:mysql://119.254.98.166:3306/merak?"
			+ "user=dbRoot&password=zhenNanYin2015&useUnicode=true&characterEncoding=UTF8";
	
	Integer startPageId = 0;
	Integer endPageId = 300;

	BookingDestTask() {
	}

	public void run() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
		headers.put("User-Agent", "Mozilla/5.0 (Windows NT 6.2; WOW64; rv:44.0) Gecko/20100101 Firefox/44.0");
		for (int destId = startPageId; destId <= endPageId; destId++) {
			try {
				con = DriverManager.getConnection(dburl);
				Statement stmt = con.createStatement();
				String query = "select dest_id from Booking_DEST where dest_id=" + destId;
				ResultSet rs = stmt.executeQuery(query);
				if (!rs.next()) {
					String indexUrl = "http://www.booking.com/searchresults.zh-cn.html?src=index&nflt=&dcid=1&si=ai%2Cco%2Cci%2Cre%2Cdi&checkin_year_month=0&checkin_monthday=0&checkout_year_month=0&checkout_monthday=0&room1=A%2CA&no_rooms=1&group_adults=2&group_children=0&ac_position=1&ac_langcode=zh&dest_id="
							+ destId + "&dest_type=country&tfl_cwh=1";
					String indexHtml = HttpClientUtil.getHtml(indexUrl, headers);
					int hotelIndex = indexHtml.indexOf("sorth1");
					if (hotelIndex < 0) {
						continue;
					}
					indexHtml = indexHtml.substring(hotelIndex, indexHtml.indexOf("家住宿", hotelIndex));
					String country = indexHtml.substring(indexHtml.indexOf(">") + 1, indexHtml.indexOf("：共"));
					indexHtml = indexHtml.substring(indexHtml.indexOf("：共") + 2);
					indexHtml = indexHtml.replaceAll(",", "");
					PreparedStatement inst = con
							.prepareStatement("insert into Booking_DEST(dest_id,hotels,country)values(?,?,?)");
					inst.setInt(1, destId);
					inst.setInt(2, Integer.valueOf(indexHtml));
					inst.setString(3, country);
					inst.execute();
					System.out.println(destId);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (con != null) {
						con.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}

	}
}
