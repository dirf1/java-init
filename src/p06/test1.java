package p06;

import java.util.Random;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		int[] nums = new int[3];
		Random random = new Random();
		for(int i=0;i<nums.length;i++) {
			nums[i] = random.nextInt(10);
			for(int j=0;j<i;j++) {
				if(nums[i]==nums[j]) {
					i--;
					break;
				}
				
//				 while(i<lotto.length) {
//			            int temp = r.nextInt(10)+1; 
//
//			            boolean isDuplicated = false; 
//			            for(int j = 0; j < i; j++){             
//			            	if(lotto[j] == temp){
//			            		isDuplicated = true;
//			                    break;
//			                }
//			            }
//
//			            if(!isDuplicated){
//			                lotto[i] = temp;
//			                i++;
//			            }
//			        }
				
			}
		}
		
		nums = new int[] {5,0,1};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("니가 생각하는 숫자를 ,를 기준으로 3개만 말해봐:");
		
		String numStr = scan.nextLine();
		
		String[] numStrs = numStr.split(",");
		
		int[] compNums = new int[numStrs.length];
		
		for(int i=0;i<numStrs.length;i++) {
			compNums[i] = Integer.parseInt(numStrs[i]);
		}
		
		int strike = 0;
		int ball =0;
		for (int i = 0; i <nums.length; i++) {
			for (int j = 0; j < compNums.length; j++) {
				if(nums[i] == compNums[j]) {
					if(i==j) {
						strike ++;
					} else {
						ball++;
					}
				}
					}
			
			
				}
				System.out.println(strike + " strike / " + ball + " ball");
			}
			
}
