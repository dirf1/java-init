package p11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassInfoController {

	
	public List<Map<String, String>> getClassInfoList(Map<String, String> param) {

	ClassInfoService ciService = new ClassInfoService();
	
	return ciService.getClassInfoList(param);
	}
	
	public int inserClassInfo(Map<String,String> classInfo) {
	return 0;
	}
	
	public int deleteClassInfo(Map<String,String> classInfo) {
	return 0;	
	}
	
	public static void main(String[] args) {
		
		ClassInfoController ciController = new ClassInfoController(); 
			
		Map<String, String> param = new HashMap<>();
			
		param.put("uiName", "성규");
		List<Map<String, String>> classInfoList= ciController.getClassInfoList(param);	
		System.out.println("등록순번\t아이디\t비밀번호\t이름");
			for ( Map<String, String> claasInfo : classInfoList ) {
				System.out.println(classInfo.get("") +);
				
		}
	}
	
		
		
	
	}
