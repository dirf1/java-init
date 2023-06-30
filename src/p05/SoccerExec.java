package p05;

public class SoccerExec {

	public static void printSoccer(Soccer[] socr) {
		for (Soccer s : socr) {
		System.out.println("팀명: " + s.team);
		System.out.println("선수명: " + s.name);
		System.out.println("팀순위: " + s.rank);
			
	 }
	}
	
	
	public static void main(String[] args) {
	
		
		Soccer s = new Soccer();
		s.team = "Totten";
		s.name = "Son";
		s.rank = 6;
		
	System.out.println("팀명: " + s.team);
	System.out.println("선수명: " + s.name);
	System.out.println("팀순위: " + s.rank);
		
//	printSoccer(s);	
//	
	
	Soccer[] socr = new Soccer[5];
	socr[0] = s;
	socr[1] = s;

	
	}
}
