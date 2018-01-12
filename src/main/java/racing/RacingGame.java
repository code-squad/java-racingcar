package racing;

import racing.model.Car;
import racing.model.GameConfiguration;
import racing.model.GameResult;
import racing.view.ResultView;

import java.util.List;

public class RacingGame {
    private ResultView resultView;
    private Mover mover;
    private WinnerEvaluator winnerEvaluator;

    public RacingGame(DeciderToGo deciderToGo) {
        this.resultView = new ResultView();
        this.mover = new Mover(deciderToGo);
        this.winnerEvaluator = new SimpleWinnerEvaluator();
    }

    public GameResult startGame(GameConfiguration gameConfiguration) {
        mover.move(gameConfiguration);

        List<Car> cars = gameConfiguration.getCars();
        List<String> results = resultView.showGameResult(cars);
        String winners = resultView.showGameWinner(winnerEvaluator.voteWinner(cars));

        return new GameResult(results, winners);
    }
}
