package p10;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBcon {

	private static final String DRIVER_CLASS = "org.mariadb.jdbc.Driver";
	private static final String URL = "jdbc:mariadb://localhost:3306/kd";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "kd1824java";

	static {
		try {
			Class.forName(DRIVER_CLASS);
			System.out.println("완료");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static Connection getCon() {
		try {

			Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
