package p09;

import java.util.Arrays;

public class SortPt {
	public static void main(String[] args) {
		
	
	int[] nums= new int[] {10, 18, 35, 17, 4};
	
	for(int j = 0; j<5; j++) {
		
		for(int i = j+1; i<5; i++) {			

	if(nums[j]>nums[i]) {
		int tmp =nums[j];
		nums[j] = nums[i];
		nums[i] = tmp;
		}
	}	
}
	
	System.out.println(nums[0] + "," +nums[1] + "," +nums[2]+ "," +nums[3]+ "," +nums[4] );
	System.out.println(Arrays.toString(nums));
	
	}
}