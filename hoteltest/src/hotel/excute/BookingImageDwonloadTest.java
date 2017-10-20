package hotel.excute;

import hotel.DbcpBean;
import hotel.booking.BookingHotelImageDownloadTask;

public class BookingImageDwonloadTest {
	public static DbcpBean db = null;

	public static void main(String[] args) throws Exception {
		int connectionCount = 100;
		db = new DbcpBean("jdbc:mysql://192.168.100.3:3306/merak?useUnicode=true&characterEncoding=UTF-8", "dbRoot",
				"zhenNanYin2015", "com.mysql.jdbc.Driver", connectionCount, connectionCount, 20000, 20000,
				connectionCount);
		BookingCountryEnum e = BookingCountryEnum.USA;
		String countryCode = e.getCountryCode();

		int taskCount = 50;
		int count = 200;

		for (int i = 0; i < taskCount; i++) {
			new Thread(new BookingHotelImageDownloadTask(count * i, count, countryCode)).start();
		}
	}

}
