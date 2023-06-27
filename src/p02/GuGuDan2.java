package p02;

import java.util.Scanner;

public class GuGuDan2 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("0-9 입력한 숫자");
	String numStr = scan.nextLine();
	System.out.println(numStr+ "숫자");
	
	int gugu = Integer.parseInt(numStr);
	
	for(int i=0;i<10;i++) {
		System.out.println( i + "x"+ numStr + " = " + gugu*i );
	
	}
}
}
