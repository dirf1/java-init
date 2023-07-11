package p11;

//스트링앞엔 파이널이 숨겨져있어서 상속이 불가능하다.
//클레스에 final이 붙으면 오버라이딩이 불가
final class Test {
	public final void test() { //메서드에 파이널일 붙을 경우 오버라이딩이 불가능함
		System.out.println("난 test");
	}
}

public class FinalTest extends TEST {
//	
//	public void test() {
//		System.out.println("난 fanal test");
//
//	}
	
	public static void main(String[] args) {
		int num =1;
		num =2;
	}

}
