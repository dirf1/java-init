
public class pratice {
	


 public static void main (String[] args) { 

	 

		int [] nums = new int[] {12, 5, 11, 15, 25 };
		int max = nums[0];
		int Idx1 = 0;
		
		for(int i = 0; i<nums.length; i++) {
			if(max<nums[i] ) {
				max = nums[i];
				Idx1 = i;
			}
		}

		System.out.println("arr max: " +max + "  index : " + Idx1 );
   


 		int [] nums2 = new int[] {4, 11, 21, 31, 41};
 		int min = nums2[0];
 		int Idx2 = 1;
 		
 		for ( int j = 0; j<nums2.length; j++) {
 			if(min>nums2[j]) { 
 				min = nums2[j];
 				Idx2 = -j;
 				
 				
 			}
 		}
 		
 		System.out.println("arr min: " +  min +"   index : " +  Idx2);
 		
 }
}
 		