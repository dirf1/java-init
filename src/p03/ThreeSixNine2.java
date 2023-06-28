package p03;

public class ThreeSixNine2 {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			String str= i + "";
			if(str.contains("3") || str.contains("6") || str.contains("9")) {
				//스트링은 13이 십삼이 아니라 일삼이다.
				// 앤드인 경우에는 트루여도 비교한다.
				System.out.println("짝,");
			}else {
				System.out.println(str + " ");
			}
			
			 if (i % 10 ==0 ) {
				 System.out.println();
		}
	}
}
}