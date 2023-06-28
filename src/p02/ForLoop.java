package p02;

public class ForLoop {
	public static void main(String[] args) {
		String[] strs = new String[100];
		
		/* 1x1 =1
		 * 2x1 
		 * .
		 * .
		 * .
		 * 9x1 =9
		 */
		
		
		for(int i=1;i<100;i++) {
			strs[i] = 100-i + "";
		}

		for(int i=0;i<100;i++) {
			System.out.println( 100-i + "x"+ 1 + " = " + strs[i]);
		}
	}
}