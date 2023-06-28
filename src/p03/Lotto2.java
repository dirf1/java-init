package p03;

import java.util.Random;

public class Lotto2 {
  public static void main (String[] args) { 
	  
	  Random random = new Random(); // 레귤러 변수 표현법 (첫 대문자만 소문자로 두번째는 그대로 둔다)
	  
	  int[] lotto = new int[40];
	  
	  for(int i=0; i<lotto.length; i++) {
		   int RN = random.nextInt(40) + 1;
		   
		   for(int j=0; j<i; j++) {
			   if(lotto[j] == RN) {
				   i--;
		
			   }
		   }
		   if(lotto[i]==0) {
		   lotto[i] = RN;
		   }
	  
	  }
	  
	  for(int i=0; i<lotto.length; i++) {
		  System.out.println("RN" + i + " = " + lotto[i]);
	  }
  }
  
}
