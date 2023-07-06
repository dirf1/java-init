package p08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import p02.Lotto;

public class LottoList {
	public static void main(String[] args) {
	
		List<Integer> lotto2 = new ArrayList<>();
		
		Random r = new Random();
		
		System.out.println("숫자 입력 후 출력");
        Scanner scanner = new Scanner(System.in);
        String lottoStr = scanner.nextLine();
        String[] strs = lottoStr.split(",");
        
		
		for( int i=0; i<7; i++) {
			int rNum = r.nextInt(6)+1;
			if(lotto2.indexOf(rNum) == -1)
			lotto2.add(rNum);
		}
	
	 
	for(int i = 0; i<lotto2.size(); i++ ) {
		System.out.println(lotto2.get(i));
		
		}
	}
}