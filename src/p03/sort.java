package p03;

import java.util.Random;
import java.util.Scanner;

public class sort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//이벤트 처리는 와일이 용이하다
		boolean correct = false; //일단 펄스로 초기화
		Random random = new Random();
		int rNum = random.nextInt(10)+1 ;
		int i = 0;
		
		while(!correct) {
			System.out.println("1~10 숫자를 입력");
		    int inputNum = Integer.parseInt(scan.nextLine());

			if(rNum == inputNum ) {
			System.out.println("맞췄다");
			}   
			else {
				System.out.println("틀렸다");
				i++;
			}
			System.out.println( i + "번 시도");
	   }
	}
}
		
	

