import racing.GameResult;
import racing.RacingGame;
import view.ResultView;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int tryCount;
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        List<String> nameList = Arrays.asList(sc.nextLine().split(","));
        System.out.println("시도할 회수는 몇 번 인가요?");
        tryCount = sc.nextInt();

        RacingGame racingGame = new RacingGame(nameList, tryCount);
        racingGame.playRacing();

        GameResult gameResult = new GameResult(racingGame.getResultState());
        ResultView resultView = new ResultView(gameResult);
        resultView.showResult();
        resultView.showWinner();
    }
}
