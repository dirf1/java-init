package p11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import p10.DBcon;

public class BoardRepository {
	/*
	 * 기능은 서비스 날아가건 불러오는건 리파이토리 디비주소 커넥션 드라이버(jdbc드라이버) id, 비밀번호
	 * 
	 */

	public List<Map<String, String>> getBoardInfoList(Map<String, String> param) {
		List<Map<String, String>> List = new ArrayList<>();
	    Connection con = DBcon.getCon();

		try {

			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM BOARD_INFO";

			ResultSet rs = stmt.executeQuery(sql);
		
			while (rs.next()) {
				Map<String, String> BoardInfo = new HashMap<>();
				BoardInfo.put("biNum", rs.getString("BI_NUM"));
				BoardInfo.put("biTitle", rs.getString("BI_TITLE"));
				BoardInfo.put("biContent", rs.getString("BI_CONTENT"));
				BoardInfo.put("biWriter", rs.getString("BI_WRITER"));
				BoardInfo.put("biCreday", rs.getString("BI_CREDAY"));
				
		
		}	

		} catch (Exception e) {
			e.printStackTrace();
		}
		return List;
	}
	
	
	
	public int UpdateList(Map<String, String> BoardInfo) {
		Connection con = DBcon.getCon();
		try {
		Statement stmt = con.createStatement();
		if(BoardInfo!=null) {
			
		
		String sql = "UPDATE BOARD_INFO SET"; 
		 	if(BoardInfo.get("biTitle") !=null)  {  
		 	sql += "BI_TITLE" + BoardInfo.get("biTitle") + "',";
		 	}
		 	if(BoardInfo.get("biTitle") !=null)  {  
			 	sql += "BI_CONTENT" + BoardInfo.get("biContent") + "',";
			 	}
		 	if(BoardInfo.get("biTitle") !=null)  {  
			 	sql += "BI_WRITER" + BoardInfo.get("biWriter") + "',";
			 	}
		 	if(BoardInfo.get("biTitle") !=null)  {  
			 	sql += "BI_CNT" + BoardInfo.get("bicnt") + "',";

		 	}
		 	
		 	sql = sql.substring(0, sql.length()-1);
		 	sql += "WHERE BI_NUM=" + BoardInfo.get("biNum");
		 	return stmt.executeUpdate(sql);
		}
		}catch (Exception e) {
		e.printStackTrace();	
		}
		return 0;
	}

 public static void main(String[] args) {
	 BoardRepository biRepo = new BoardRepository();
	List<Map<String, String>> boardInfoList = biRepo.getBoardInfoList();
	for(Map<String, String> boardInfo : boardInfoList) {
		System.out.println(boardInfo);
	}
	Map<String, String> boardInfo = new HashMap<>();
	boardInfo.put("biNum", "1");
	boardInfo.put("biNum", "1");
	int result = biRepo.updateBoardInfo(boardInfo);
	System.out.println("업데이트 결과" + result);
	
	
}
	

}


