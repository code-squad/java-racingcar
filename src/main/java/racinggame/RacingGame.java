package racinggame;

import racinggame.domain.Cars;
import racinggame.domain.RacingResult;
import racinggame.view.InputView;
import racinggame.view.ResultView;

public class RacingGame {
    public static void main(String[] args) {
        String carNames = InputView.getCarNames();
        int tryNo = InputView.getTryNo();

        Cars cars = new Cars(carNames);
        RacingResult result = cars.racing(tryNo);

        ResultView.printResult(result);
    }
}
