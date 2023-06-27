package p01;

public class Convert {

	public static void main(String[] args) {
		int i = 1;
		String s ="1";
		String s1 = i + "";
		System.out.println(s.equals(s1));
		
//		int il = s + 1; //숫자 더하기 문자면 문자이기 때문에 불가능
	    int il = Integer.parseInt(s);
	    System.out.println(i==il);
	    
	    String str = "sa";
	    int i2 = Integer.parseInt(str);
	    System.out.println(i2);
	}
}
