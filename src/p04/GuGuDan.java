package p04;

public class GuGuDan {

	public static void printGuGuDan(int gugu, int con) {
		
		for(int j=1; j<gugu+1; j++) {
			for(int i=1; i<con+1; i++) {
		    System.out.println( j + "x" + i + "=" + j*i);
			}
		}	
	}
	public static void main(String[] args) {
		printGuGuDan(9,15);

	}
}
	

