package p08;

import java.util.ArrayList;
import java.util.List;

public class ListTest3 {
	public static void main(String[] args) {
		 
	
	ArrayList<String> strList = new ArrayList<>(); //1.8 이상은 뒤에 꺾쇠 <>가 표준이다
	
	
	List<String> strList2 = new ArrayList<String>();
	strList2.add("안녕");
	System.out.println(strList2.get(0));
	
	strList2.remove(0);
	System.out.println(strList2.get(0));
	
	
//	String[] strs = new String[3];
//	strs[0] = "우리";
//	strs[1] = "모두";
//	strs[2] = "화이팅";
//	
//	ArrayList<String> strsList2 = new ArrayList<String>();
//	
//	strsList2.add(strs[0]);
//	strsList2.add(strs[1]);
//	strsList2.add(strs[2]);
//	System.out.println(strsList);
//	
//	for (int i = 0; i < strsList2.size(); i++) {
//		System.out.println(strsList2.get(i));

		
	}
}
