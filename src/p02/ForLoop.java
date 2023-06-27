package p02;

public class ForLoop {
	public static void main(String[] args) {
		String[] strs = new String[10];
		
		/* 1x1 =1
		 * 2x1 
		 * .
		 * .
		 * .
		 * 9x1 =9
		 */
		
		
		for(int i=1;i<10;i++) {
			strs[i] = 10-i + "";
		}

		for(int i=0;i<10;i++) {
			System.out.println( 10-i + "x"+ 1 + " = " + strs[i]);
		}
	}
}