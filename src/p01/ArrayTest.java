package p01;

public class ArrayTest {
	public static void main(String[] args) {
		int[] lotto = new int[6];  //6개의 변수가 필요하다면 배열. 로또는 인트가 아니지만 로또의 첫번째는 인트다.
		//원래는 초기화를 해야하지만 자바가 알아서 초기화를 해준다.
		System.out.println(lotto[0]);
		System.out.println(lotto[1]);
		System.out.println(lotto[2]);
		System.out.println(lotto[3]);
		System.out.println(lotto[4]);
		System.out.println(lotto[5]);
		
		
		lotto[0] = 1;	 
		lotto = new int[5];
	
	
	}
}
