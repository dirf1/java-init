package p09;

import java.util.Arrays;

public class SortTest2 {
	public static void main(String[] args) {
		
	
	int[] nums= new int[] {10, 18, 35, 17, 4};
					

	if(nums[0]>nums[1]) {
		int tmp =nums[0];
		nums[0] = nums[1];
		nums[1] = tmp;
	}
	if(nums[0]>nums[2]) {
		int tmp =nums[0];
		nums[0] = nums[2];
		nums[2] = tmp;
	
	}
	if(nums[0]>nums[3]) {
		int tmp =nums[0];
		nums[0] = nums[3];
		nums[3] = tmp;
	
}
	if(nums[0]>nums[4]) {
		int tmp =nums[0];
		nums[0] = nums[4];
		nums[4] = tmp;
		
		
		
	}
	/////배열 1부터 시작

	if(nums[1]>nums[2]) {
		int tmp =nums[1];
		nums[1] = nums[2];
		nums[2] = tmp;
	}
	
	if(nums[1]>nums[3]) {
		int tmp =nums[1];
		nums[1] = nums[3];
		nums[3] = tmp;
	
}
	if(nums[1]>nums[4]) {
		int tmp =nums[1];
		nums[1] = nums[4];
		nums[4] = tmp;
	}
	
	
/////배열 2부터 시작

	if(nums[2]>nums[3]) {
		int tmp =nums[2];
		nums[2] = nums[3];
		nums[3] = tmp;
	}
	
	if(nums[2]>nums[4]) {
		int tmp =nums[2];
		nums[2] = nums[4];
		nums[4] = tmp;
	
}
	
/////배열 3부터 시작

	if(nums[3]>nums[4]) {
		int tmp =nums[3];
		nums[3] = nums[4];
		nums[4] = tmp;
	}
	
	System.out.println(nums[0] + "," +nums[1] + "," +nums[2]+ "," +nums[3]+ "," +nums[4] );
	System.out.println(Arrays.toString(nums));
	
	}
}