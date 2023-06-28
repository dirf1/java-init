package p03;

import java.util.Scanner;

public class Lotto3 {
	public static void main(String[] args) {
		System.out.println("1~45 범위 중 6개 입력");
		Scanner scanner = new Scanner(System.in);
		String lottoStr = scanner.nextLine();
		String[] strs = lottoStr.split(",");
		for(int i=0; i<strs.length;i++) {
			System.out.println(strs[i]);
			
				
		
		}
	}
}

