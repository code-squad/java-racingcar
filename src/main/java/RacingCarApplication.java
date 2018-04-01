import game.RacingGame;

import java.util.Scanner;

public class RacingCarApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("자동차 대수는 몇 대 인가요?");
        int carCount = scanner.nextInt();

        System.out.println("시도할 회수는 몇 회 인가요?");
        int time = scanner.nextInt();

        RacingGame racingGame = new RacingGame(time, carCount);
        racingGame.start();
    }
}
