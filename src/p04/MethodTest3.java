package p04;

public class MethodTest3 {
	/*
	 * void
	 * 데이터 타입
	 * - 기본형
	 *		숫자
	 *정수
	 *실수
	 *		문자
	 *		논리
	 *		참조
	 */	
	public static void test() {
		
	}
	
	
	public static int getNum() {
//		return 1;
		return (int)1.1;
		//메서드의 데이터 타입과 맞으면 상관없다.
	}
	
	public static void main(String[] args) {
		int num = getNum();
		System.out.println(num);
		//		String str = test();
//		return;
	 //보이드는 메써드 앞에서만 사용이 가능하다.
	}
}
