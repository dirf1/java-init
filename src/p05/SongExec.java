package p05;

public class SongExec {

	
	public static void printSong(Song[] sings) {
		for(Song s : sings) {
		
		System.out.println("곡명: "+ (s.name));
		System.out.println("가수명: "+ (s.singer));
		System.out.println("가수의구간: "+ (s.rank));
		}
	
	}
	
	public static void main(String[] args) {
		
		Song s = new Song();
		s.name ="북두칠성";
		s.singer="로이킴";
		s.rank =2;
		
//		printSong(s);
		
		
		Song[] sings = new Song[4];
		sings[0] = s;
		sings[0] = s;
		
		
		printSong(sings);
	}
}
