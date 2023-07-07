package p10;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("ID : ");
		String uiId = scan.nextLine();
		System.out.println("PASS : ");
		String uipwd = scan.nextLine();
		System.out.println("Name : ");
		String uiName = scan.nextLine();

		String sql = "INSERT INTO user_info2 (Ui_ID, UI_PWD, UI_NAME)";

		sql += "VALUES('" + uiId + " ' ,'" + uipwd + " ' ,'" + uiName + " ')";
	
		Connection con = DBcon.getCon();

		try {
			Statement stmt = con.createStatement();
			int resultCnt = stmt.executeUpdate(sql);

			if (resultCnt == 1) {
				System.out.println(uiName + "님의 정보가 등록되었습니다.");
			} else {
				System.out.println("오류가 발생했습니다.");

			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
