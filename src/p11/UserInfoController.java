package p11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserInfoController {

	public List<Map<String, String>> getUserInfoList(Map<String, String> param) {
		// 리스트는 참조형이기에 널이 대입이 된다.
		UserInfoService uiService = new UserInfoService();
		// List<Map<String, String>> userInfoList = uiService.getUserInfoList();
		// return null;
		// 위의 과정을 아래로 축약
		return uiService.getUserInfoList(param);
	}

	public int insertUserInfo(Map<String, String> userInfo) {
		UserInfoService uiServise = new UserInfoService();
		return uiServise.insertUserInfo(userInfo);
	}

	public int deleteUserInfo(Map<String, String> userInfo) {
		UserInfoService uiServise = new UserInfoService();
		return uiServise.deleteUserInfo(userInfo);

	}

	public static void main(String[] args) {
		// 위의 getUserInfoList를 넣으면 안 되는 이유는 스태틱이 아니기 때문. 메모리를 생성해줘야함.

		UserInfoController uiController = new UserInfoController();
//		uiController.getUserInfoList("param");
//		Scanner scan = new Scanner(System.in);
		Map<String, String> param = new HashMap<>();
		param.put("uiName", "성규");
//		param.put("uiId", "");
		List<Map<String, String>> userInfoList = uiController.getUserInfoList(param);
		System.out.println("번호\t이름\t아이디\t비밀번호");
		for (Map<String, String> userInfo : userInfoList) {
			System.out.println(userInfo.get("uiNum") + "\t" + userInfo.get("uiName") + "\t" + userInfo.get("uiId")
					+ "\t" + userInfo.get("uiPwd") + "\t");

		}

	}
}
