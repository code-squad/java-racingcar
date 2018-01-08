package racingGame;

import java.util.List;

public class ResultView {

    public void printResult(RacingGame racingGame) {
        List<Car> carList = racingGame.getCarList();
        for (Car car : carList) {
            System.out.println(car.resultString());
        }
    }
}
