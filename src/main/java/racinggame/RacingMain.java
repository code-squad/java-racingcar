package racinggame;

import java.util.Scanner;

public class RacingMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 대수는 몇대 인가요?");
        int carNumber = scanner.nextInt();


        System.out.println("시도할 회수는 몇회 인가요?");
        int count = scanner.nextInt();

        Racing racing = new Racing(carNumber, count);
        racing.racing();

        System.out.println("실행 결과");
        racing.racingResult();
    }
}
