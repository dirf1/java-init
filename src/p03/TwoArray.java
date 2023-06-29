package p03;

public class TwoArray {
	public static void main(String[] args) {

		int sqr = 1*6;
		
		int[][] numsArray = new int[3][3];
		System.out.println(numsArray.length);
		
		for (int i = 0; i < numsArray.length; i++) {
			for (int j = 0; j < numsArray[i].length; j++) {
				numsArray[i][j] = 1;
		}	
	}
		for (int i = 0; i < numsArray.length; i++) {
			for (int j = 0; j < numsArray[i].length; j++) {
				numsArray[i][j] = sqr++;
				  System.out.print(numsArray[i][j]+ " ");
			}
			        System.out.println("");
		}
						
			}
		
}

