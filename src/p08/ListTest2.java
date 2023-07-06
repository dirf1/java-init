package p08;

import java.util.ArrayList;
import java.util.Arrays;

public class ListTest2 {

	public static void main(String[] args) {
		
		
		float[] fls =new float[3];
		
		fls[0] = 1.1f;
		fls[1] = 22.1f;
		fls[2] = 0.1111f;
				
		char[] Chars = new char[4];
		
		Chars[0] = 'a';
		Chars[1] = 'b';
		Chars[2] = 'c';
		
		String[] strs = new String[3];
		
		
		strs[0] = "우리";
		strs[1] = "모두";
		strs[2] = "화이팅";
		
		
		
		
		
		
		ArrayList<String> strsList = new ArrayList<String>();
		
		strsList.add(strs[0]);
		strsList.add(strs[1]);
		strsList.add(strs[2]);
		System.out.println(strsList);
		
		for (int i = 0; i < strsList.size(); i++) {
			System.out.println(strsList.get(i));
	
		}
		
		ArrayList<Float> floatList = new ArrayList<Float>();
		
		floatList.add(fls[0]);
		floatList.add(fls[1]);
		floatList.add(fls[2]);
		System.out.println(floatList);
		for (int i = 0; i < floatList.size(); i++) {
			System.out.println(floatList.get(i));
		}
		
		
		ArrayList charsList = new ArrayList();
		
		charsList.add(Chars[0]);
		charsList.add(Chars[1]);
		charsList.add(Chars[2]);
		charsList.add(Arrays.toString(Chars));
		System.out.println(charsList);
		for (int i = 0; i < charsList.size(); i++) {
			System.out.println(charsList.get(i));
			
			}
			
		}
	
}

