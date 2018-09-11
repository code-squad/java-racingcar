package racingcar;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] carNames = InputView.inputCars();
        int time = InputView.inputTime();

        Racing race = new Racing(carNames);
        List<Car> cars = race.run(time);

        ResultView.printResult(cars);
    }
}
