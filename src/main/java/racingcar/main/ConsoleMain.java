package racingcar.main;

import racingcar.domain.GameResult;
import racingcar.domain.RacingGame;
import racingcar.view.InputView;
import racingcar.view.ResultView;

public class ConsoleMain {

    public static void main(String[] args) {

        RacingGame racingGame = new RacingGame(InputView.getcars());
        int tryNo = InputView.getTryNo();
        GameResult result = null;

        for(int i = 0; i < tryNo; i++) {
            result = racingGame.choiceMovingCar();
            ResultView.printCarRoutes(result);
        }

        ResultView.printWinnerCarRacing(result.getWinnerNames());
    }
}
