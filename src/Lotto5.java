import java.util.HashSet;
import java.util.Set;
import java.util.Random;
import java.util.Scanner;

public class Lotto5 {
    public static void main(String[] args) {
        Set<Integer> lottoSet = new HashSet<>();
        Random r = new Random();

        // 중복 없는 랜덤 로또 번호 생성
        while (lottoSet.size() < 6) {
            lottoSet.add(r.nextInt(45) + 1);
        }

        System.out.println("1~45 범위 중 6개 입력");
        Scanner scanner = new Scanner(System.in);
        String lottoStr = scanner.nextLine();
        String[] strs = lottoStr.split(",");
        
        int rNum = 0; // 맞춘 번호 개수를 저장하는 변수
        for (String str : strs) {
            int userInput = Integer.parseInt(str); // 사용자 입력을 정수로 변환
            if (lottoSet.contains(userInput)) { // 로또 번호 중 사용자의 입력과 일치하는 번호가 있으면 카운트 증가
                rNum++;
            }
        }
        
        System.out.println("번호 중에 "+rNum + "개 맞추셨습니다");

        // 랜덤으로 생성된 로또 번호 출력
        System.out.println("당첨 번호는 다음과 같습니다");
        for (int number : lottoSet) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
