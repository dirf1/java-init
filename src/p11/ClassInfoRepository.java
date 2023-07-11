package p11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import p10.DBcon;

public class ClassInfoRepository {

	public List<Map<String, String>> getClassInfoList(Map<String, String> param);
	{

	List<Map<String, String>> classInfoList = new ArrayList<>();
	
	Connection con = DBcon.getCon();

	try
	{

		Statement stmt = con.createStatement();

		String sql = "SELECT * FROM CALLS1TBL";

		if (param != null) {
			if (param.get("uiName") != null) {
		
				sql += "WHERE UI_NAME LIKE '%";
		}
	}
	ResultSet rs = stmt.executeQuery(sql);

	while(rs.next())v  {
		Map<String, String> classInfo = new HashMap<>();

		classInfo.put("uiNum", rs.getString("UI_NUM"));
		classInfo.put("uiId", rs.getString("UI_ID"));
		classInfo.put("uiPwd", rs.getString("UI_PWD"));
		classInfo.put("uiName", rs.getString("UI_NAME"));

		classInfoList.add(classInfo);

			}
		}catch(Exception e) {							 
		e.printStackTrace();
		 
		}
	
		
	return classInfoList;

			
		}
}
