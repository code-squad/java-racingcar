package racingcar;

import java.util.List;

public class RacingApplication {
    public static void main(String[] args) {
        RacingGame rc = new RacingGame(InputView.inputNameOfCar());
        int testCase = InputView.inputTestCase();

        for (int count = 0; count < testCase; count++) {
            List<Car> cars = rc.moveCar();
            ResultView.printStatus(cars);
        }
        ResultView.printWinner(rc.getCarRacingWinner());
    }
}
