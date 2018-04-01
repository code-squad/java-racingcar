package racing;

import racing.speed.Speed;
import racing.speed.SpeedImpl;

import java.util.Scanner;

public class StartRacingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 댓수는 몇대인가요 ?");
        int numberOfCar = scanner.nextInt();

        System.out.println("시도할 횟수는 몇 회 인가요?");
        int time = scanner.nextInt();

        Speed speed = new SpeedImpl();
        RacingGame racingGame = new RacingGame(speed, time, numberOfCar);
        racingGame.bbang();
    }
}
