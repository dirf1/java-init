package p01;

public class Condition {
	public static void main(String[] args) {
		
		int age = 10;
		  //펄스를 일레븐에 대입됐으면, if에 사용할 수 있으면 age == 11; 대입도 된다.
		if(age == 11) { 
			System.out.println("11살");
		}else if (age==10) {
			System.out.println("10살1");
		}else if (age==10) {
			System.out.println("10살2");
		
		}else if (age==10) {
			System.out.println("10살3");
		
		}
		else {
			System.out.println("11살 아님");
		}
	}
}
