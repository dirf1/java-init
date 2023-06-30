package p05;

public class MinMax {
	public static void main(String[] args) {
		
		int[] nums = new int[] {4, 12, 5, 15, 25};
		int max= nums[0]; //맥스값을 0으로 두면 정수거나 양수여야한다.
		int index1 = 0;
		for(int i = 1; i<nums.length; i++) {
			if(max<nums[i]) {
				max = nums[i];
				index1 = -i;
			}
		}
			System.out.println("최대값:" + max + ", index: " + index1);
			int[] nums2 = new int[] {4, 12, 5, 15, 25};    
			int min= nums2[0];
			int index2 = 1;
				for(int j =0; j<nums2.length; j++) {
					if(min>nums2[j]) {
						min = nums2[j];
						index2 = -j;
						//인덱스 마이너스 값을 추가하면서 
					}
				}
	
				System.out.println("최소값:" + min + ", index: " +index2  );
				
	}
}

