package racingCar;

import java.util.List;

public class RacingCarMain {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        inputView.setup();

        Racing racingCar = new Racing(inputView.getCarNumbers(), inputView.getTimes());
        List<Car> result = racingCar.race(inputView.getCarNames());

        ResultView resultView = new ResultView(result);
        resultView.result();
    }
}
