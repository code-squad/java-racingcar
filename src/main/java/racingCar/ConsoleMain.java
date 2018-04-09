package racingCar;

import racingCar.domain.Racing;
import racingCar.domain.Winner;
import racingCar.view.InputView;
import racingCar.view.ResultView;

import java.util.List;
public class ConsoleMain {
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
