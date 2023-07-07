package p10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("ID : ");
		String uiID = scan.nextLine();
		System.out.println("PASS : ");
		String uipwd = scan.nextLine();

		String sql = "INSERT  ";
		sql += "WHERE UI_ID = '" + uiID + "' AND UI_PWD='" + uipwd + "'";
		
//		
//		String sql = "INSERT INTO user_info(UI_ID, UI_PWD, UI_NAME)\r\n"
//				+ "VALUES('TEST2','TEST1','연습1')";
//		int resultCnt = stmt.executeUpdate(sql);
		
		
		Connection con = DBcon.getCon();

		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			if (rs.next()) {
				String user = rs.getString("UI_NAME");
				System.out.println("ui_NAME  " + user + "사용자 ");
			} else {
				System.out.println("아이디 혹은 비밀번호 오류입니다");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
