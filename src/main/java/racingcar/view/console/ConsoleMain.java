package racingcar.view.console;

import racingcar.domain.GameResult;
import racingcar.domain.RacingGame;

import java.util.List;

/**
 * @author sangsik.kim
 */
public class ConsoleMain {

    public static void main(String[] args) {
        List<String> names = InputView.getNames();
        Integer runCount = InputView.getRunCount();

        RacingGame racingGame = new RacingGame(names);
        GameResult gameResult = null;

        for (int i = 0; i < runCount; i++) {
            gameResult = racingGame.run();
            PrintView.printProgress(gameResult);
        }
        PrintView.printWinners(gameResult);
    }
}