package p11;

import java.util.List;
import java.util.Map;

public class ClassInfoService {

	
	public List<Map<String, String>> getClaasInfoList(Map<String, String> param){
		ClassInfoRepositori ciRepo = new ClassInfoRepository();
		return ciRepo.getClassInfoList(param);
	}
}
