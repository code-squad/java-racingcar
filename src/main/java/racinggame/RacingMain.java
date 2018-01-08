package racinggame;

import java.util.Scanner;

public class RacingMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carNames = scanner.nextLine();

        System.out.println("시도할 회수는 몇회 인가요?");
        int count = scanner.nextInt();

        Racing racing = new Racing(count, carNames.split(","));
        racing.racing();

        System.out.println("실행 결과");
        racing.racingResult();
    }
}
