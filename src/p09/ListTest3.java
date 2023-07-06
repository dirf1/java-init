package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest3 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		
		/*
		 * numList의 size가 50이 될 때 까지 추가
		 * 값은 1qnxj 200까지 랜덤값인데 중복은 x
		 * 값이 홀수 일 경우에만 추가
		 */
	
		Random r = new Random();
		while (numList.size()<50) {
			int rNum = r.nextInt(200)+1;
			if(rNum % 2 == 1 && numList.indexOf(rNum)==-1) {
				numList.add(rNum);
			}
			System.out.println(numList);
			
		}
		
		
		
		for (int i = 0; i <numList.size(); i++) {
			String numStr = numList.get(i).toString();
			
			numStr = numStr.replace("2", "홀수");
			numStr = numStr.replace("4", "홀수");
			numStr = numStr.replace("6", "홀수");
			numStr = numStr.replace("8", "홀수");
			numStr = numStr.replace("0", "홀수");
			System.out.println(numList.get(i) + " " + numStr);
									
					
					
			
		}
		
		
		
		
		
		
	
	}
}
