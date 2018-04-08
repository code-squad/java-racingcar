package racingCar;

import racingCar.game.Racing;
import racingCar.game.Winner;
import racingCar.view.InputView;
import racingCar.view.ResultView;

import java.util.List;

public class RacingCarMain {
    public static void main(String[] args) {
        List<String> carsName = InputView.setCarsName();
        int tryCount = InputView.setTryNo();

        Racing racingCar = new Racing(carsName, tryCount);
        racingCar.race();

        Winner winner = new Winner(racingCar.getGameResult());

        ResultView resultView = new ResultView(racingCar.getGameResult());
        resultView.result(winner.winnerCheck());
    }
}
