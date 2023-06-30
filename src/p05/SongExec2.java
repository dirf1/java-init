package p05;

public class SongExec2 {

//	
//public static void printSong(Song[] sings) {
//		for(Song s : sings) {
//		
//		System.out.println("곡명: "+ (s.name));
//		System.out.println("가수명: "+ (s.singer));
//		System.out.println("가수의구간: "+ (s.rank));
//		}
//}
//	
	
	
	public static void main(String[] args) {
		
		Song s = new Song();
		s.name ="북두칠성";
		s.singer="로이킴";
		s.rank =2;
		
//		printSong(s);
		
		
		Song[] sings = new Song[6];
		
		sings[1] = new Song();
		sings[1].name = "북두칠성";
		sings[1].singer = "로이킴";
		sings[1].rank = 5;
		
		sings[2] = new Song();
		sings[2].name = "살아가는거야";
		sings[2].singer = "로이킴";
		sings[2].rank = 4;
		
		sings[3] = new Song();
		sings[3].name = "봄봄봄";
		sings[3].singer = "로이킴";
		sings[3].rank = 1;
		
		sings[4] = new Song();
		sings[4].name = "love";
		sings[4].singer = "로이킴";
		sings[4].rank = 2;
		
		sings[5] = new Song();
		sings[5].name = "문득";
		sings[5].singer = "로이킴";
		sings[5].rank = 3;
		
		
		
		int max = sings[1].rank; 
		int index1 = 1;
		for(int i = 0; i<sings.length; i++) {
			if(max<sings[1].rank) {
				max = sings[1].rank;
				index1 = i;
			
		
				
			
			
			
			}
		}
		
		System.out.println("인기노래: " + s.name + ", 자리수: " + index1);		
		System.out.println("가수명: " + s.singer );
		
	
	}
}
