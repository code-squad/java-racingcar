import racingGame.RacingGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("자동차 대수는 몇 대인가요?");
        Scanner scanner = new Scanner(System.in);

        int carNum = scanner.nextInt();

        System.out.println("시도할 회수는 몇 회인가요?");
        int time = scanner.nextInt();

        RacingGame racingGame = new RacingGame(time,carNum);
        racingGame.move();
        racingGame.printCar();
    }
}
