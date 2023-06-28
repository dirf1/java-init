package p03;

import java.util.Random;
import java.util.Scanner;

public class Lotto4 {
    public static void main(String[] args) {
        int i = 0; // i 변수 선언 0초기화
        int[] lotto = new int[6]; //lotto라는 정수 배열 선언 크기는 6
        Random r = new Random(); //랜덤 객체 생성 후 r로 변수지정

        // 1-45 범위의 랜덤 로또 번호 생성
        for(; i<lotto.length; i++) {
            lotto[i] = r.nextInt(45)+1;
            //i가 로또 배열 길이보다 작을 경우 계속 1씩 증가
        }
                
        System.out.println("1~45 범위 중 6개 입력");
        //사용자에게 번호를 입력하라는 프린트구문
        
        Scanner scanner = new Scanner(System.in);
        //스캔을 입력받을 수 있는 객체 생성 System.in은 표준 입력(보통키보드)를 나타냄
        
        String lottoStr = scanner.nextLine();
        //nextLine() 메소드를 사용해서 사용자가 입력하는 전체 줄을 스트링 타입의 lottoStr 변수로 저장
        
        String[] strs = lottoStr.split(",");
        // 로또str을 쉼표로 나눈뒤 strs 라는 스트링 배열에 저장

        int rNum = 0; // 맞춘 번호 개수를 저장하는 변수를 선언하고 초기화

        for(i = 0; i<strs.length; i++) {
            int userInput = Integer.parseInt(strs[i]);
            //strs배열의 i번째 로또 번호를 정수로 변환하여 유저인풋 변수에 저장
            for (int j = 0; j<lotto.length; j++) {
            	// j를 초기화하고 로또 배열보다 작은 동안에 1씩 증가하게 반복
            	// 사용자가 입력한 로또 번호가 생성된 번호 하나와 일치하는지 확인하는 용도
                if(userInput == lotto[j]) { 
                	// 사용자 입력(유저인풋[i])이 로또 번호(j)와 일치하면 카운트 증가
                    rNum++;
                    break;
                }
            }
        }

        System.out.println("번호 중에 "+rNum + "개 맞추셨습니다.");

        // 랜덤으로 생성된 로또 번호 출력
        System.out.println("당첨 번호는 다음과 같습니다.");
        for(i = 0; i<lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
    }
}
