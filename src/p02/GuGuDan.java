package p02;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("1-9까지 숫자 입력: ");
	String numStr = scan.nextLine();
	System.out.println("입력한 숫자 : " + numStr);
	int gugu = Integer.parseInt(numStr);//숫자로 분석
	
	for(int i=0;i<10;i++) {
		System.out.println( numStr + "x"+ i + " = " + gugu*i );
	
	
     }
 }
}