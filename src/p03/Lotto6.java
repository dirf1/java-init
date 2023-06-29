package p03;

import java.util.Random;
import java.util.Scanner;

public class Lotto6 {
    public static void main(String[] args) {
        int i = 0; 
        int[] lotto = new int[6]; 
        Random r = new Random(); 

      
        
        while(i<lotto.length) {
            int temp = r.nextInt(45)+1; 

            boolean isDuplicated = false; 
            for(int j = 0; j < i; j++){             
            	if(lotto[j] == temp){
            		isDuplicated = true;
                    break;
                }
            }

            if(!isDuplicated){
                lotto[i] = temp;
                i++;
            }
        }
                
        System.out.println("6개 입력");
        Scanner scanner = new Scanner(System.in);
        String lottoStr = scanner.nextLine();
        String[] strs = lottoStr.split(",");

        int rNum = 0; 

        for(i = 0; i<strs.length; i++) {
            int userInput = Integer.parseInt(strs[i]); 
            for (int j = 0; j<lotto.length; j++) {
                if(userInput == lotto[j]) { 
                    rNum++;
                    break;
                }
            }
        }

        System.out.println("번호 중에 "+rNum + "개 맞추셨습니다"); 
        System.out.println("당첨 번호는 다음과 같습니다");
        for(i = 0; i<lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }

        scanner.close();
    }
}
