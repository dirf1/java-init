package p09;

import java.util.ArrayList;
import java.util.List;

public class ListTestPr {

	public static void main(String[] args) {
		
		List<Integer> maxminList = new ArrayList<>();
		
		int [] nums = new int[5];
		
		nums[0] = 10;
		nums[1] = 17;
		nums[2] = 29;
		nums[3] = 39;
		nums[4] = 31;
		
		maxminList.add(nums[0]);
		maxminList.add(nums[1]);
		maxminList.add(nums[2]);
		maxminList.add(nums[3]);
		maxminList.add(nums[4]);
		
		for (int i = 0; i <maxminList.size(); i++) {
			System.out.println(maxminList);
			
		}
		
		
	}
		
		
	
}



