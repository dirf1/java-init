package p04;



public class MethodTest4 {
//메서드란 기능을 저장하기 위해 사용함
	public static int[] getLotto() {
		int [] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = MethodTest2.getRandomNum(45);	
		}
		return lotto;
	}
	
	int a; //변수란 다양한 값을 저장하기 위해 사용하는 수. 고정값 저장을 위한 것이면 상수로 했을 것.
		
public static void mian(String[] args) {
/*  String[] str = new String[1];
	String[] str2 = str;
	str[0] = "안녕";
//	str = null;
	System.out.println(str2[0]);
	
	*/
	int [] lotto = getLotto();
			}
	
	
}
