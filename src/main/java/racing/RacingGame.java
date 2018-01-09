package racing;

import racing.model.Car;
import racing.model.GameConfiguration;
import racing.view.InputView;
import racing.view.ResultView;

import java.util.List;

public class RacingGame {
    private InputView inputView;
    private ResultView resultView;
    private Mover mover;
    private WinnerEvaluator winnerEvaluator;

    public RacingGame(DeciderToGo deciderToGo) {
        this.inputView = new InputView();
        this.resultView = new ResultView();
        this.mover = new Mover(deciderToGo);
        this.winnerEvaluator = new SimpleWinnerEvaluator();
    }

    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame(new SimpleDeciderToGo());
        racingGame.startGame();
    }

    private void startGame() {
        GameConfiguration gameConfiguration = inputView.requestToInput();
        mover.move(gameConfiguration);

        List<Car> cars = gameConfiguration.getCars();
        resultView.showGameResult(cars);
        resultView.showGameWinner(winnerEvaluator.voteWinner(cars));
    }
}
