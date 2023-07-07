package p10;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class SelectTest {
	public static void main(String[] args) {

		try {
			Connection con = DBcon.getCon();

			String sql = "SELECT * FROM USER_INFO2";

			Statement stmt = con.createStatement(); // 수화기

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String UiId = rs.getString("UI_ID");
				String UiPwd = rs.getString("UI_PWD");
				String UiName = rs.getString("UI_NAME");
				int uiNum = rs.getInt("UI_NUM");
				System.out.println("ui_ID : " + UiId + " , ");
				System.out.println("ui_Pwd : " + UiPwd + " , ");
				System.out.println("ui_Namd : " + UiName + " , ");
				System.out.println("ui_Num : " + uiNum + " , ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
