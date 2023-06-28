package p03;

import java.util.Random;
import java.util.Scanner;

public class Lotto3 {
	public static void main(String[] args) {
		
		/*int[] lotto = new int[6]; << 만들어서
		 *  랜덤이던 메쓰.랜덤이던 로또번호를 6개 만들어서 위에 넣으세요
		 *  넣은 값에서 몇개가 맞았는지 출력하는 걸 만들기
		 * 
		 */
		boolean correct = false; 
		int i = 0;
		
		
		int[] lotto = new int[6];
//		Random r = new Random();
//		int rNum = r.nextInt(45)+1 ;
		for(; i<lotto.length; i++) {
//			lotto[i] = /**/.nextInt(45)+1;
		}
				
		System.out.println("1~45 범위 중 6개 입력");
		Scanner scanner = new Scanner(System.in);
		String lottoStr = scanner.nextLine();
		String[] strs = lottoStr.split(",");
		
		
		
		for(; i<strs.length;i++) {
			for (int j=0; j<lotto.length; j++) {
				//이쪽에다가 로직을
		
			}
			
			System.out.println("개 맞추셨습니다");
			
		}
	}
}

