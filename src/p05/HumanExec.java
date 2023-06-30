package p05;



public class HumanExec {

	public static void printHuman(Human[] hm ) {
		for(Human h : hm ) {
		System.out.println("이름은?: " + h.name);
		System.out.println("재산은?: " + h.money);

		}
	}
	
	public static void main(String[] args) {
	 
		Human[] h = new Human[5];
		for(int i=0; i<h.length; i++) {
		h[i] = new Human();
		}
		
		h[0].name = "임성규";
		h[0].money= 10;
		
		
		h[1].name = "윤민용";
		h[1].money= 20;
		
		
		h[2].name = "이재민";
		h[2].money= 30;

		
		h[3].name = "박진호";
		h[3].money= 40;
		
		
		h[4].name = "윤주성";
		h[4].money= 50;
		
		
		int sum = 0;
		for(int i=0; i<h.length; i++) {
			sum += h[i].money;
			System.out.println(h[i].money);
			System.out.println(sum);
			
			
		}
		int avg = sum/h.length;
		String names = "";
for(int i=0; i<h.length; i++) {
	if(avg<=h[i].money) {
		names += h[i].name + "님, " ;
		
	}
}
		names = names.substring(0, names.length()-2);
		System.out.println(names + "은 평균 이상입니다");
		

		}
	
	
		
		
		
	
	}

