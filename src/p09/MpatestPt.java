package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MpatestPt {

	public static void main(String[] args) {
		//어레이가 아닌 해쉬맵
		
		
		Map<String, String> ml = new HashMap<>();
		ml.put("name","임성규");
		ml.put("age","27");
		ml.put("addr","의정부");
		ml.put("phone","갤럭시");
		ml.put("email","naver");
		
		Map<String, String> ml2 = new HashMap<>();
		ml2.put("name","송경석");
		ml2.put("age","27");
		ml2.put("addr","의정부");
		ml2.put("phone","아이폰");
		ml2.put("email","google");
		
		Map<String, String> ml3 = new HashMap<>();
		ml3.put("name","김홍균");
		ml3.put("age","27");
		ml3.put("addr","서울");
		ml3.put("phone","아이폰");
		ml3.put("email","daum");
		
		Map<String, String> ml4 = new HashMap<>();
		ml4.put("name","이성호");
		ml4.put("age","27");
		ml4.put("addr","서울");
		ml4.put("phone","아이폰");
		ml4.put("email","kakao");
		
		Map<String, String> ml5 = new HashMap<>();
		ml5.put("name","김정훈");
		ml5.put("age","26");
		ml5.put("addr","부천");
		ml5.put("phone","갤럭시");
		ml5.put("email","nate");
		
	
	
		List<Map<String,String>> mlLast = new ArrayList<>();
		mlLast.add(ml);
		mlLast.add(ml2);
		mlLast.add(ml3);
		mlLast.add(ml4);
		mlLast.add(ml5);
		System.out.println(mlLast);
	
//		for(String name : mlLast ) {
//			System.out.println(name);
//		}
		
		
	
	for(int i = 0; i<mlLast.size(); i++) {
		Map<String,String> map = mlLast.get(i);
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " " + map.get(key) + " ");
			
		}
		System.out.println();
		
		}
	
	
	
	}	
}
