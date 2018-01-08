import racingGame.RacingGame;
import racingGame.ResultView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대인가요?");
        int carNum = scanner.nextInt();
        System.out.println("시도할 회수는 몇 회인가요?");
        int time = scanner.nextInt();

        RacingGame racingGame = new RacingGame(time,carNum);

        ResultView resultView = new ResultView();

        racingGame.runGame();

        resultView.printResult(racingGame);

    }
}
