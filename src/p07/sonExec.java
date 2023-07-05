package p07;

class Song{
	public int rank;
	public String title; 
	public static int a;
	
	
	public void pintTitle() {
		
	
		System.out.println("노래 제목: " + title);
		//스태틱은 스태틱에서만 사용이 가능하다.
		//반대 개념은 된다.
	}
}

public class sonExec {
	public static void main(String[] args) {
		son s = new son();
		s.name = "손흥민";
		s.job = "축구선수";
		s.age = 30;
		s.hobby = "드리블";
				
		s.printJob();
		s.printHobby();
		
		
		
		
		father f =new son();
		
		son f2 = (son)f;
		
		f2.name = " 아빠 ";
		f2.hobby = " 영화 시청 ";
		
		
		
		
		System.out.println(f2.name +"의 취미는" +f2.hobby + "입니다.");
//		
//		Song song = new Song();
//		song.title = "널 안나오게";
//		song.pintTitle(); 
		
		
		
		
		//파더는 손이 어딨는지 모른다.
//		Song song = new Song();
//		song.name = "이름이없어서 쓸 수 가 없다";
		//son에서 파더를 받았기 때문에 파더의 값을 쓸 수 있는 것이다.
	}

}
