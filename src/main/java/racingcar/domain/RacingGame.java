package racingcar.domain;

import racingcar.view.InputView;
import racingcar.view.ResultView;

import java.util.*;

public class RacingGame {

    public static final int RULENUM = 4;
    private static Random random = new Random();
    public List<Car> cars;

    public RacingGame(List<Car> cars) {
        this.cars = cars;
    }

    public GameResult choiceMovingCar() {
        for(Car car: cars) {
          car.move(getRandomMoveValue());
        }

        return new GameResult(this.cars);
    }

    public int getRandomMoveValue() {
        return random.nextInt(10);
    }

    public static void main(String[] args) {

        RacingGame racingGame = new RacingGame(InputView.getcars());
        int tryNo = InputView.getTryNo();
        GameResult result = null;

        for(int i = 0; i < tryNo; i++) {
            result = racingGame.choiceMovingCar();
            ResultView.printCarRoutes(result);
        }

        ResultView.printWinnerCarRacing(result.getWinnerNames());
    }
}
