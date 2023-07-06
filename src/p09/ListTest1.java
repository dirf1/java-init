package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {

	
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		Random r = new Random();
		
		/*
		 * 반복문 6번을 돌려서 랜덤값을 넘리스트에 추가해주세요
		 * 단 랜덤값은 중복이 불가능
		 */
		
		for(int i = 1; i<6; i++) {
			
			int rNum = r.nextInt(100)+1;
			
			if (numList.indexOf(rNum) == -1) {
			numList.add(rNum);
		}else { 
			i--;
	}
}
		
		while(numList.size()<6) {
			int rNum = r.nextInt(100)+1;
			if(numList.indexOf(rNum)==-1) {
				numList.add(rNum);
			}
//			System.out.println(numList.get(i));
			System.out.println(numList);
			
		}
		
		int min = numList.get(0);
		int max = numList.get(0);
		for (int i = 0; i < numList.size(); i++) {
			if(min>numList.get(i)) {
				min = numList.get(i);
			}
			}
			System.out.println("min :" +min);
			System.out.println("max :" +max);
		
	}
}
