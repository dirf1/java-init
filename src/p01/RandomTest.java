package p01;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		
		
		Random r = new Random(); //r의 데이터타입은 랜덤 
		int[] random = new int[3];
		
		random[0] = r.nextInt(10)+1; //소문자 괄호 메소드 넥스트인트를 긁어보면 어디서 온건지 정보가 나옴.
		System.out.println(random[0]);
		random[1] = r.nextInt(10)+1; 
		System.out.println(random[1]);
		random[2] = r.nextInt(10)+1; 
		System.out.println(random[2]);
	
		for(int i=0; i<3; i++) {
			System.out.println(random[i]);
		
		}	
	}
}
		
	

