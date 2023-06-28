package p03;

import java.util.Random;

public class Lotto {
  public static void main (String[] args) { 
	  Random random = new Random(); // 레귤러 변수 표현법 (첫 대문자만 소문자로 두번째는 그대로 둔다)
	  int[] lotto = new int[7];
	  for(int i=0; i<lotto.length; i++) {
		   int rNum = random.nextInt(6) + 1;
		   for(int j=0; j<i; j++) {
			   if(lotto[j] == rNum) {
				   i--;
		
			   }
		   }
		   if(lotto[i]==0) {
		   lotto[i] = rNum;
		   }
	  
	  }
	  
	  for(int i=0; i<lotto.length; i++) {
		  System.out.println("[" + i + "] : " + lotto[i]);
	  }
  }
}
