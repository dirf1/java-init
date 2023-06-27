package p02;

public class ArrayTest {
	public static void main(String[] args) {
	   //str은 스트링 '배열' 타입임 스트링 배열이면 1이 되야함
	   String[] strs; // 선언
	   String[] strs2 = new String[2]; //변순 선언과 초기화
	   System.out.println(strs2[0]);
	   System.out.println(strs2[1]);
	   strs2[0] = "1";
	   strs2[1] = "1";

	   String str0 = "1";
	   String str1 = "2";
	   
	   
	   String[] strNums = new String[10];
	   // 0->10 
	   // 1 ->2
	   // 2 ->3
	   // 9 ->10
	   
	   for(int i=0; i<10; i=i++) 
		   //System.out.println(i+",");
		   //System.out.println(i+1);
		   strNums[i] = i+1+"";
			   
			   
	}
	
	
}
	   
	   
	   
	   
	   
	

