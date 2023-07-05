package p07;



class Mother{
	public void work() {
		System.out.println("어머님이 집안일을 하십니다.");
	}
}

class Daughter{
	public void work2() {
		System.out.println("어머님이 집안일을 하십니다.");
	}
}
	

public class Overriding2 {
	public static void work(Mother[] ms) {
			for(int i = 0; i<ms.length; i++) {
				Mother m = ms[i];
			//m이 Daughter라고 불릴 수 있다면
				//딸이 개발
			}
	}
	
	
	public static void main(String[] args) {
		Daughter d = new Daughter();
		Mother m = new Mother();
		
		
		System.out.println(d instanceof Daughter);
		System.out.println(m instanceof Mother);
	
		
		


	}
}

