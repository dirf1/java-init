package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapTestPt2 {

	public static void main(String[] args) {
		
		Map<String,String> mp = new HashMap<>();
		
		mp.put("이름","임성규");
		mp.put("주소","의정부시");
		
		Map<String,Integer> mp2 = new HashMap<>();
		
		mp2.put("나이", 27);
		mp2.put("생년", 97);
		
		
		List<Map<String,String>> ml = new ArrayList<>();
		ml.add(mp);
		List<Map<String,Integer>> ml2 = new ArrayList<>();
		ml2.add(mp2);
		for(Map<String,String> mp3 : ml )
		System.out.println(ml);
		System.out.println(ml2);
		
		for(int i = 0; i<ml.size(); i++) {
			Map<String, String> maptest = ml.get(i);
			Iterator<String> it = maptest.keySet().iterator();
			while(it.hasNext()) {
				String key = it.next();
				System.out.println(key + maptest.get(key));
			}
			
			
			
		}
		
		
		/////////
//		for(Map<String,String> map : ml){
//			System.out.println(ml);
//		}
//		for(Map<String,Integer> map : ml2){
//			System.out.println(ml2);
		
		////////
		
		/*
		 * StringBuilder sb = new StringBuilder();
		 * 
		 * for (Map<String, String> map : ml) { sb.append(map).append(" "); }
		 * 
		 * for (Map<String, Integer> map : ml2) { sb.append(map).append(" "); }
		 * 
		 * System.out.println(sb.toString());
		 */		
		/////////////////// 아래로 축약
		
		
		StringBuilder sb = new StringBuilder();
		sb.append(ml).append(ml2);
		System.out.println(sb.toString());
		
		
		
		
		///////

		
		
		
		
	}

}
