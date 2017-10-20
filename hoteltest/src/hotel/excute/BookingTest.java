package hotel.excute;

import hotel.DbcpBean;
import hotel.booking.BookingHotelTask;

public class BookingTest {
	public static DbcpBean db = null;

	public static void main(String[] args) throws Exception {
		int connectionCount = 350;
		db = new DbcpBean("jdbc:mysql://119.254.98.166:3306/merak?useUnicode=true&characterEncoding=UTF-8", "dbRoot",
				"zhenNanYin2015", "com.mysql.jdbc.Driver", connectionCount, connectionCount, 20000, 20000,
				connectionCount);
		BookingCountryEnum e = BookingCountryEnum.GBR;
		int start = e.getStart();
		int end = e.getEnd();
		String countryCode = e.getCountryCode();
		// new Thread(new BookingDestTask()).start();

		int gap = (end - start) / 311;

		for (int i = start; i < end; i = i + gap) {
			new Thread(new BookingHotelTask(i, i + gap, countryCode)).start();
		}
	}

}
