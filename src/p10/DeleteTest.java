package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DeleteTest {

	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con; 
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/kd", "root", "kd1824java");
			Statement stmt = con.createStatement();
			String sql = "SELECT FROM USER_INFO2 WHERE UI_NUM=8";
			int resultCnt = stmt.executeUpdate(sql);
			
			System.out.println("반영된 행 개수" + resultCnt);
		
		} catch (Exception e) {
			e.printStackTrace();	
		}
	}
}

