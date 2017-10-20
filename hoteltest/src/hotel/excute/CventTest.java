package hotel.excute;

import hotel.DbcpBean;
import hotel.cvent.CventHotelTask;

public class CventTest {
	public static DbcpBean db = null;

	public static void main(String[] args) throws Exception {
		int connectionCount = 30;
		db = new DbcpBean("jdbc:mysql://119.254.98.166:3306/merak?useUnicode=true&characterEncoding=UTF-8", "dbRoot",
				"zhenNanYin2015", "com.mysql.jdbc.Driver", connectionCount, connectionCount, 10000, 10000,
				connectionCount);
		CventCountryEnum e = CventCountryEnum.USA;
		Integer sbr = e.getSbr();
		Integer ma = e.getMa();
		Integer csn = e.getCsn();
		Integer total = e.getTotal();
		String countryCode = e.getCountryCode();
		String country = e.getCountry();

		for (int i = 0; i < 30; i++) {
			new Thread(new CventHotelTask(2 * i + 1, 2 * (i + 1), sbr, ma, csn, total, countryCode, country)).start();
		}
	}

}
