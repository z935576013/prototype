package hotel;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class DbcpBean {
	/** 数据源，static */
	private static DataSource DS;

	/** 从数据源获得一个连接 */
	public Connection getConnection() {
		Connection con = null;
		if (DS != null) {
			try {
				con = DS.getConnection();
			} catch (Exception e) {
				e.printStackTrace(System.err);
			}
			try {
				con.setAutoCommit(true);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return con;
		}
		return con;
	}

	/** 构造函数，初始化了 DS ，指定 所有参数 */
	public DbcpBean(String connectURI, String username, String pswd, String driverClass, int initialSize, int maxActive,
			int maxIdle, int maxWait, int minIdle) {
		initDS(connectURI, username, pswd, driverClass, initialSize, maxActive, maxIdle, maxWait, minIdle);
	}

	public static void initDS(String connectURI, String username, String pswd, String driverClass, int initialSize,
			int maxtotal, int maxIdle, int maxWaitMillis, int minIdle) {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(driverClass);
		ds.setUsername(username);
		ds.setPassword(pswd);
		ds.setUrl(connectURI);
		ds.setInitialSize(initialSize); // 初始的连接数；
		ds.setMaxTotal(maxtotal);
		ds.setMaxIdle(maxIdle);
		ds.setMaxWaitMillis(maxWaitMillis);
		ds.setMinIdle(minIdle);
		DS = ds;
	}

	// public static void main(String[] args) {
	//
	// DbcpBean db = new DbcpBean("jdbc:mysql://119.254.98.166:3306/merak",
	// "dbRoot", "zhenNanYin2015",
	// "com.mysql.jdbc.Driver", 200, 200, 200, 10000, 200);
	// Connection conn = null;
	// Statement stmt = null;
	// ResultSet rs = null;
	// try {
	// conn = db.getConn();
	// stmt = conn.createStatement();
	// rs = stmt.executeQuery("select * from test limit 1 ");
	// System.out.println("Results:");
	// int numcols = rs.getMetaData().getColumnCount();
	// while (rs.next()) {
	// for (int i = 1; i <= numcols; i++) {
	// System.out.print("\t" + rs.getString(i) + "\t");
	// }
	// System.out.println("");
	// }
	// } catch (SQLException e) {
	// e.printStackTrace();
	// } finally {
	// try {
	// if (rs != null)
	// rs.close();
	// if (stmt != null)
	// stmt.close();
	// if (conn != null)
	// conn.close();
	// if (db != null)
	// shutdownDataSource();
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	// }
}
