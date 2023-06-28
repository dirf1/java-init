package p02;

import java.util.Random;

public class Lotto2 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
     	for(int i=0; i<lotto.length; i++) {
		double db = Math.random();
		db *= 45;
		db += 1;
		int rNum = (int)db;
		lotto[i] = rNum;
		System.out.println(rNum);
     	}
		for(int i=0; i<lotto.length; i++) {
			System.out.println("lotto["+ i + "]="+lotto[i]);
		

			Random r = new Random(); 
			int[] random = new int[10];
			
			random[1] = r.nextInt(7)+1;
			System.out.println(random[1]);
		
		
		
		
		}
	}	
}


