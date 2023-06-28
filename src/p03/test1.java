package p03;

import java.util.Random;

public class test1 {
	public static void main (String[] args) { 
		  
		  Random random = new Random(); 
		  int[] lotto = new int[45];
		  for(int i=0; i<lotto.length; i++) {
			   int Number = random.nextInt(45) + 1;
			   
			   for(int j=0; j<i; j++) {
				   if(lotto[j] == Number) {
					   i--;
			
				   }
			   }
			   if(lotto[i]==0) {
			   lotto[i] = Number;
			   }
		  
		  }
		  
		  for(int i=0; i<lotto.length; i++) {
			  System.out.println("Number" + i );
		  }
	  }
	  
	}
