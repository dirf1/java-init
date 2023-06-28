package p03;

import java.util.Random;
import java.util.Scanner;

public class Lotto6 {
    public static void main(String[] args) {
        int i = 0; //변수 초기화 i = 0;
        int[] lotto = new int[6]; //숙제 조건 로또 번호를 저장할 배열
        Random r = new Random(); //랜덤 객체 생성

        /* 1-45 범위의 랜덤 로또 번호 생성, 중복 체크 */
        
        while(i<lotto.length) {
        //6개의 번호 생성 과정을 반복을 위한 while문 
            int temp = r.nextInt(45)+1; //1부터 45사이의 랜덤한 숫자 생성

            boolean isDuplicated = false; //참거짓을위한 불리언과 중복과 관련된 변수
            for(int j = 0; j < i; j++){
                //지금까지 생성된 변수와 비교하기 위한 새로운 번호 반복문
            	if(lotto[j] == temp){
                    //새로 생성한 번호가 이미 생성된 것들 중에 있는지 체크
            		isDuplicated = true;
            		//중복되면 트루
                    break;
                }
            }

            if(!isDuplicated){
            	//새로 생성한 번호가 중복되지 않았을 경우에 로또 번호 배열 추가
                lotto[i] = temp;
                i++;
            }
        }
                
        System.out.println("1~45 범위 중 6개 입력");
        Scanner scanner = new Scanner(System.in);
        String lottoStr = scanner.nextLine();
        String[] strs = lottoStr.split(",");

        int rNum = 0; // 맞춘 번호 개수를 저장하는 변수

        for(i = 0; i<strs.length; i++) {
            int userInput = Integer.parseInt(strs[i]); // 사용자 입력을 정수로 변환
            for (int j = 0; j<lotto.length; j++) {
                if(userInput == lotto[j]) { // 사용자 입력이 로또 번호와 일치하면 카운트 증가
                    rNum++;
                    break;
                }
            }
        }

        System.out.println("번호 중에 "+rNum + "개 맞추셨습니다");

        // 랜덤으로 생성된 로또 번호 출력
        System.out.println("당첨 번호는 다음과 같습니다");
        for(i = 0; i<lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }

        scanner.close();
    }
}
