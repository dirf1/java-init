package p02;

public class AcceseModifier {
	int b = 10;
	public static void main(String[] args) {
		int i = 1;	
		System.out.println(i);
		AcceseModifier am = new AcceseModifier();
		System.out.println(am.b);
		
		AcceseModifier aml = new AcceseModifier(); //스트링이랑 똑같이 new를 붙이면 계속 생성이 가능하다.
		System.out.println(aml.b);
	}
}

