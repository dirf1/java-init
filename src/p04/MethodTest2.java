package p04;

import java.util.Random;

public class MethodTest2 {

	public static int getRandomNum(int max) {
		Random r = new Random();
		int rNum = r.nextInt(max); //되는 이유는 넥스트인트()의 데이터 타입이 int라서
		rNum +=1; //rNum이 int니까 +1 당연히 된다
		return rNum;
	}
	
	public static void main(String[] args) {
		System.out.println(MethodTest2.getRandomNum(10));
	    System.out.println(MethodTest2.getRandomNum(100));
		System.out.println(MethodTest2.getRandomNum(1000));
	    System.out.println(getRandomNum(10));
		System.out.println(getRandomNum(100));
		System.out.println(getRandomNum(1000));
		
			
		}
	
	
	
	

}
