package p09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		map.put("age", 33);
		map.put("like", 20);
		map.put("rank", 11);
		//age가 2개라면 변수로 인식해서 하나가 사라진다.
		
		Set<String> keySet = map.keySet();
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key : " + key + ", value : " + map.get(key));
		}
		
		
//		for(int i =0; i<map.size(); i++) {
//			System.out.println(map.get(i));
//		}
		//인덱스가 없어서 순서를 알 수 없다.
	}
}
