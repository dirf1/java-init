package p04;

class Test{
	public static int getNum() {
		return 1;
	}
}

public class MethodTest {
	
	public static int getNum() {
		return 0;
		
	}
	
	public static String getStr() {
		return "";
	}
	
	public static void test() {
		return;
		//리턴은 되는데 무언가를 리턴할 순 없음 없음
		//테스트의 타입은 보이드이기 때문에 인트 타입인 '1' 을 리턴에 넣으면 오류가 뜬다.
	}
	
	public static void main(String[] args) {	
		//객체지향에는 함수를 펑션이 아닌 메서드로 부른다 다른 곳에서 메서드라 부르지 않으면 펑션이라 이해하면 된다.
	
		int a = 1;
		int b = getNum();
		//근본적으로 위의 가정이 되는 이유는 인트(정수형)라는 속성인 같은 타입이기 때문
		//하지만 롱을 인트에 넣는다는 기본 규격에 벗어나는 행위는 안된다.
		String str = getStr();
		
		
	}
}
