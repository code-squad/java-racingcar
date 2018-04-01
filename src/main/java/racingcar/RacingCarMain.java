package racingcar;

import java.util.Scanner;

public class RacingCarMain {

    public static void main(String[] args) {

        System.out.println("자동차 대수는 몇 대 인가요?");
        Scanner scanner = new Scanner(System.in);
        int car = scanner.nextInt();
        System.out.println("시도할 회수는 몇 회 인가요" );
        int move = scanner.nextInt();

        RacingCar.racing(car, move);
    }
}
