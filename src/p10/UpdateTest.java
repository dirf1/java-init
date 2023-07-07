package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateTest {
	public static void main(String[] args) {

		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}

		try {
			Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/kd", "root", "kd1824java");

			Statement stmt = con.createStatement(); // 수화기

			String sql = "UPDATE user_info2 SET ui_name = '임성규' WHERE ui_num =1";

			int resultCnt = stmt.executeUpdate(sql);
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("반영된 행 개수" + resultCnt);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}