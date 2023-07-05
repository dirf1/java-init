package p08;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {
		String str1 = "안녕 ";
		String str2 = "날 소개";
		String str3 = "할게.";
		String str4 = " 내 이름은 임성규";
		String str5 = " 장래희망은 ";
		String str6 = "보안 전문가란다 ";
		
		
		String strs1 = "정말";
		String strs2 = "반가워";
		String strs3 = "집에 애니데스크";
		String strs4 = "집에 깔아야 된단다.";
		
		
		
		
		String[] str = new String[6];
		str[0] = str1;
		str[1] = str2;
		str[2] = str3;
		str[3] = str4;
		str[4] = str5;
		str[5] = str6;
		
		String[] strs = new String[5];
	
		
		
		
				
		
		
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] );
		}
		
		ArrayList<String> strList = new ArrayList<String>();
		
		System.out.println(strList.size());
		strList.add(str1);
		System.out.println(strList);
		strList.add(str2);
		System.out.println(strList);
		strList.add(str3);
		System.out.println(strList);
		strList.add(str4);
		System.out.println(strList);
		strList.add(str5);
		System.out.println(strList);
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		
	}
}
