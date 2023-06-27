package p01;

import java.util.Random;
import java.util.Scanner;

public class FindNum {
	public static void main(String[] args) {
		Random r = new Random();
		int rNum = r.nextInt(3) + 1; //0부터 2까지의 난수
		Scanner scan = new Scanner(System.in);
		for(int i=1; i<=3; i++) {
			System.out.println("숫자입력:");
//			String str = scan.nextLine();
//			int num = Integer.parseInt(scan.nextLine());
			if(rNum==Integer.parseInt(scan.nextLine())) {
				System.out.println("맞춤");
			}else {
				System.out.println("못맞춤");
			}
		}
	}
}


