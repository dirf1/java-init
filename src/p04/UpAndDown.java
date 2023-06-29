package p04;

import java.util.Random;
import java.util.Scanner;


public class UpAndDown {

	public static int getRN() {
		
		Random r = new Random();
		return r.nextInt(50)+1;   
		
	}
	
	public static void match(int num1, int num2) {
		
	}

	public static void main(String[] args) {
		
		int rNum = getRN();
		int num = 0;
		
		while (rNum != num) {    
		Scanner scan = new Scanner(System.in);
		System.out.print("1-50:");		
		String numStr =scan.nextLine();
		int numP = Integer.parseInt(numStr);
		
		
	
		}
	/*	for(i = 0; i<rNum.length; i++) {
            System.out.print(rNum[i] + " ");*/
        }
	
		
		}

	
		/* rNum과 numStr이 값은 값이라면 맞췄다
		 * nNum이 numStr의 값보다 더 크면 UP
		 * rNum이 numStr의 값보다 작다면 Down
		 * */
		
	
	

