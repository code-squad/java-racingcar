import racing.RacingGame;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfCar, tryCount;
        System.out.println("자동차 대수는 몇 대 인가요?");
        numberOfCar = sc.nextInt();
        System.out.println("시도할 회수는 몇 번 인가요?");
        tryCount = sc.nextInt();

        RacingGame racingGame = new RacingGame(numberOfCar, tryCount);
        racingGame.playRacing();
        racingGame.showState();
    }
}
