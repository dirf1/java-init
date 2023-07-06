package p09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTest5 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		
		
		Integer[] arr = new Integer[] {10,1,35,17,4};
		
//		arr[0] =10;
//		arr[1] =1;
//	    arr[2] =35;
//		arr[3] =17;
//		arr[4] =4;
				
				
		
		
	for(int j = 0; j<5; j++) {
		for(int i = j+1; i<5; i++){
			if(arr[j]>arr[i]) {
				int tmp =arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
			}
			System.out.println(Arrays.toString(arr));
		
			numList.add(arr[0]);
			numList.add(arr[1]);
			numList.add(arr[2]);
			numList.add(arr[3]);
			numList.add(arr[4]);
//			Collections.sort(numList);
//			System.out.println(numList);
		}
	}
		
	}
}
