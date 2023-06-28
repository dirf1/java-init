package p03;

import java.util.Random;
import java.util.Scanner;

public class Lotto7Practice {
    public static void main(String[] args) {
        int i = 0; 
        /*변수 초기화 i = 0;
         * 변수 i 선언 0으로 초기화
         * 반복문의 카운터
         * 로또 번호를 생성하기 위한 초기 값
         */
        int[] lotto = new int[6]; 
        /*로또 번호를 저장할 정수형(int) 배열을 선언 후 초기화
         * 로또는 숙제의 내용대로 6개만 사용하므로 
         * 6개의 원소를 가진 배열 생성
         */
        
        Random r = new Random(); 
        //랜덤 클래스의 객체를 생성
        
        while(i<lotto.length) {
        /*로또 번호를 생성하는 반복문
         *i<lotto.length 라는 조건은 i가 lotto배열(6)의 길이보다 작을동안 반복 
         * 즉, 로또 번호 6개가 모두 생성될 때까지 반복하라는 의미
         */
    
            int temp = r.nextInt(45)+1; 
            /*1부터 45사이의 랜덤한 숫자 생성
             *랜덤 객체인 r을 사용하여 1부터 45 사이의 랜덤한 정수를 생성
             * nextInt(45)는 0부터 44 사이의 숫자를 반환하므로 45를 얻기위해 +1
             */
            boolean isDuplicated = false; 
            /*중복 체크를 위한 불리언의 변수를 선언하고 펄스로 초기화.
             *해당 변수는 새로 생성된 숫자 'tmp'가 이미 배열에 존재하는지 판단하는 데 사용 
             *우선 초기 상태에는 중복이 없다는 가정으로 false 설정
             */
         
            for(int j = 0; j < i; j++){
                /*반복문으로 배열의 각 원소를 점검
                 * j < i 라는 조건은 현재까지 채워진 배열의 부분집합만 점검하라는 의미
                 * 한마디로 lotto[0]부터 lotto[i-1]까지 점검하라는 의미
                 */
            	
            	if(lotto[j] == temp){
                    /* 만약 j 번째 원소가 새로 생성한 'temp'와 같은지 확인
                     */
            		
            		isDuplicated = true;
            		break;
            		//같다면 트루로 설정하고 반복문을 멈춤
                    
                }
            }

            if(!isDuplicated){
            	lotto[i] = temp;
                i++;
           /*새로 생성한 번호'temp'가 중복되지 않았을 경우에 
            * 'temp' i 번째 원소에 할당하고 i를 1증가시킴 
            * 이로써 중복되지 않는 새로운 로또번호를 생성하고 배열을 추가한 것
            */             	
                
            }
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
            int testInput = Integer.parseInt(strs[i]);
            //strs배열의 i번째 로또 번호를 정수로 변환하여 유저인풋 변수에 저장
            
            for (int j = 0; j<lotto.length; j++) {
            	// j를 초기화하고 로또 배열보다 작은 동안에 1씩 증가하게 반복
            	// 사용자가 입력한 로또 번호가 생성된 번호 하나와 일치하는지 확인하는 용도
                
            	if(testInput == lotto[j]) { 
                	// 사용자 입력(유저인풋[i])이 로또 번호(j)와 일치하면 카운트 증가
                    
            		rNum++;
//            		break;
                }
            }
        }

        System.out.println("번호 중에 "+rNum + "개 맞추셨습니다");

        // 랜덤으로 생성된 로또 번호 출력
        System.out.println("당첨 번호는 다음과 같습니다");
        for(i = 0; i<lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
    }
}
