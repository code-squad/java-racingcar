package racingcar;

import java.util.List;

/**
 * @author sangsik.kim
 */
public class Main {

    public static void main(String[] args) {
        List<String> names = InputView.getNames();
        Integer runCount = InputView.getRunCount();

        RacingGame racingGame = new RacingGame(names);
        GameResult gameResult = null;

        for (int i = 0; i < runCount; i++) {
            gameResult = racingGame.run();
            PrintView.print(gameResult);
        }
        PrintView.printWinners(gameResult);
    }
}