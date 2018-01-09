import racingGame.RacingGame;
import racingGame.ResultView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carName = scanner.nextLine();
        System.out.println("시도할 회수는 몇 회인가요?");
        int time = scanner.nextInt();

        RacingGame racingGame = new RacingGame(time,carName);

        ResultView resultView = new ResultView();

        racingGame.runGame();

        resultView.printResult(racingGame);

    }
}
