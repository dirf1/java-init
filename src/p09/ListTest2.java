package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest2 {

	public static void main(String[] args) {
		
		List<Integer> numList = new ArrayList<>();
		/*
		 * numList의 size가 20이 될때까지
		 * 랜덤값을 1-100까지 추가합니다.
		 * 단 중복은x
		 */
		
		Random r = new Random();

		while( numList.size()<100) {
			int rNum = r.nextInt(100)+1;
				if(numList.indexOf(rNum) == -1) {
					numList.add(rNum);
				} 
		
	}
//		System.out.println(numList);
		for (int i = 0; i <numList.size(); i++) {
		int num = numList.get(i);
		int mod = num & 10;
		int quo = num / 10;
		if(mod == 3 || mod == 6 || mod == 9 ||quo == 3 || quo == 6 || quo == 9) {
			if((mod == 3 || mod == 6 || mod == 9 ) && (quo == 3 || quo == 6 || quo == 9)) {
			System.out.println(num + " 짝짝");
		}else {
			System.err.println(num + "짝 ");
		}
		
	} 	else { 
//		System.out.println(num);
			}
		}
//		for (int i = 1; i <numList.size(); i++) {
//			System.out.println(numList.get(i));
//			
//		}
		
		for (int i = 0; i <numList.size(); i++) {
			String numStr = numList.get(i).toString();
			
			numStr = numStr.replace("3", "짝");
			numStr = numStr.replace("6", "짝");
			numStr = numStr.replace("9", "짝");
			System.out.println(numList.get(i) + " " + numStr);
			
		}

		
//		for (int i = 1; i<=numList.size(); i++) {
//			String str = numList + "";
//			if (str.indexOf("3") || str.indexOf("6") || str.indexOf("9") ) {
//				System.out.print("짝 ");
//			} else {
//				System.out.println(str + " , ");
//			}
//			if(i % 10 ==0) {
//				System.out.println("");
//			
//				}

		/*
		 출력할때 반복문을 사용해서 출력
		 * 숫자에 3,6,9가 있을 경우 짝
		 */
		
		}
	}




