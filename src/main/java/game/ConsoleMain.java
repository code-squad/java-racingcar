package game;

import game.domain.GameResult;
import game.domain.RacingGame;
import game.view.InputView;
import game.view.ResultView;

public class ConsoleMain {

    public static void main(String[] args) {
        String carNames = InputView.getCarNo();
        int tryNo = InputView.getTryNo();

        RacingGame racingGame = new RacingGame(carNames);
        GameResult gameResult = racingGame.move(tryNo);

        ResultView.print(gameResult);
    }
}
