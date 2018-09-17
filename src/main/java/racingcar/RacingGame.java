package racingcar;

import java.util.ArrayList;

public class RacingGame {
    public static void main(String[] args) {
        ArrayList<Car> cars = InputView.createCars(InputView.inputCars());
        Racing racing = new Racing();
        ArrayList<Car> car = racing.runGame(cars);
        ResultView.printResult(car);
        ResultView.printWinner(car);
    }
}