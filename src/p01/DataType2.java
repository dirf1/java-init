package p01;

import java.util.Scanner;

public class DataType2 {
	public static void main(String[] args) {
		
		String str = "1234"; //앞이 대문자면 스트링 안의 모든 걸 다 사용이 가능함.
		System.out.println(str.length());
		System.out.println(str.substring(1));
		System.out.println(str.substring(1,3));
	    int idx = str.indexOf("3"); 
	    System.out.println("3의 index : " + idx);// 시스템 대문자 클래스
	    idx = str.indexOf("5");
	    System.out.println("5의 index : " + idx);
	    
	    Scanner scan = new Scanner(System.in); //스캐너는 다른 패키지인데 임포트를 안했기 때문에 빨간줄이 그어짐
	    
  }
}
