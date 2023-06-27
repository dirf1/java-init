package p02;

public class Lotto {
	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
		int rNum = (int)Math.random(); // 0 ~ 0.9999999999
		// 최소값 :0, 최대값: 0.9 => 0~9 +1 => 1~10
		//최소값 :1 최대값: 45
		//System.out.println(rNum);
		System.out.println(Math.random()*44+1);
		
	}
	}
}

