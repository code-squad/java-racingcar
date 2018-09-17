package racingcar;

import java.util.ArrayList;

public class RacingGame {
    public static void main(String[] args) {

        ArrayList<Car> cars;
        Racing racing = new Racing();
        cars = racing.run();

        ResultView.printResult(cars);
        ResultView.printWinner(cars);
    }
}
