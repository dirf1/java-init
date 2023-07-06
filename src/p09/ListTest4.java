package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest4 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();

		
		
		
		System.out.println("3개 숫자 입력 후 출력"); //2,7,5
		
		
		
			
		Scanner scan = new Scanner(System.in);
        String numStr = scan.nextLine();
        String[] strs = numStr.split(",");
	
//        strs[0] = "1";
//        strs[0] = "2";
//        strs[0] = "3";
        
		/*
		 * numStr를 , 기준으로 배열을 만드신 후
		 * numList에 추가해주세요
		 */
		
//        strs.add(numList);
	
        for (int i = 0; i<strs.length; i++) {
//        	System.out.println(numList.get(i));
        	
        	int num = Integer.parseInt(strs[i]);
        	
        	numList.add(num);
			
        
        }
        
        	System.out.println("숫자 3개를 , 기준으로 입력 : "); //1,3,5
        	numStr = scan.nextLine();
        	strs = numStr.split(",");
        	
        	int cnt = 0;
        	
        	for (int i = 0; i<strs.length; i++) { //1
        		int num = Integer.parseInt(strs[i]); //스트링을 나타낼 땐 항상 파스인트로 숫자
        	
        		for (int j = 0; j <numList.size(); j++) {//2
            		if(num == numList.get(j)) {
            	}
        	}
        		System.out.println("맞춘 개수" + cnt);
        		
        		
        		if(numList.indexOf(num)!=-1) {//1
        			cnt++;
        		}
        	  

        	
        			String str = numList.get(i).toString();
        			
        		
        			numStr = numStr.replace("", "");
        			numStr = numStr.replace("", "");
        			System.out.println(numList.get(i) + " " + numStr);
        	
            	
            	
            	
	
        	}
        	
		}
	}