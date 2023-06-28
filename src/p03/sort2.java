package p03;

import java.util.Random;
import java.util.Scanner;

public class sort2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean correct = false; 
		Random random = new Random();
		int rNum = random.nextInt(10)+1 ;
		int i = 0;
		
		while(!correct) {
			System.out.println("1~10 숫자를 입력");
		    int inputNum = Integer.parseInt(scan.nextLine());

			correct = rNum == inputNum;  
			System.out.println("맞췄다");
			i++;
			
	}
		
		System.out.println( i + "번 시도");
}
}
		
	

