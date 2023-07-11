package p11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import p10.DBCon;
import p10.DBcon;

public class UserInfoRepository {
	/*
	 * 기능은 서비스 날아가건 불러오는건 리파이토리 디비주소 커넥션 드라이버(jdbc드라이버) id, 비밀번호
	 * 
	 */

	public List<Map<String, String>> getUserInfoList(Map<String, String> param) {
		List<Map<String, String>> userInfoList = new ArrayList<>();
		Connection con = DBcon.getCon();

		try {

			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM USER_INFO2";
			if (param != null) {
				if (param.get("uiName") != null) {
					sql += " WHERE UI_NAME LIKE '%" + param.get("uiName") + "%'" ;
				//왜 낫 널 부터 시작하는지 생각을 해야된다.
				}
			}
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Map<String, String> userInfo = new HashMap<>();

				userInfo.put("uiNum", rs.getString("UI_NUM"));
				userInfo.put("uiId", rs.getString("UI_ID"));
				userInfo.put("uiPwd", rs.getString("UI_PWD"));
				userInfo.put("uiName", rs.getString("UI_NAME"));

				userInfoList.add(userInfo);
		}	

		} catch (Exception e) {
			e.printStackTrace();
		}
		return userInfoList;
	}
	
	
	public int insertUserInfo(Map<String,String> userInfo) {
		Connection con  = DBcon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO USER_INFO2(UI_ID, UI_PWD, UI_NAME)";
			sql += " values('" + userInfo.get("uiId") + "','" + userInfo.get("uiPwd") + "',";
			sql += " '" + userInfo.get("uiName") + "')";
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int deleteUserInfo(Map<String, String> userInfo) {
		Connection con = DBcon.getCon();
		try {
		Statement stmt = con.createStatement();
		String sql = "DELETE FROM USER_INFO2 WHERE UI_ID=" + userInfo.get("uiId");
		return stmt.executeUpdate(sql);
		} 
		catch (Exception e) {
		e.printStackTrace();	
		}
		
	}
}


