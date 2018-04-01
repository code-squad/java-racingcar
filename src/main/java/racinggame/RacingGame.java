package racinggame;

import java.util.List;
import java.util.Random;

import static java.util.Objects.isNull;

public class RacingGame {

    private final static int MAX_LIMIT = 9;
    private final static int MOVE_CRITERIA = 4;
    private List<Car> carList;
    private RacingGameView racingGameView;

    RacingGame(List<Car> carList, RacingGameView racingGameView) {
        if (isNull(carList) || carList.isEmpty() || isNull(racingGameView))
            throw new IllegalArgumentException();

        this.carList = carList;
        this.racingGameView = racingGameView;
    }

    void start() {
        carList.forEach(this::move);
    }

    private void move(Car car) {
        if (isMoveAble(getRandomInt()))
            car.move();
    }

    boolean isMoveAble(int num) {
        return num >= MOVE_CRITERIA;
    }

    void printRacingResult() {
        racingGameView.printAll(carList);
    }

    private int getRandomInt() {
        return new Random().nextInt(MAX_LIMIT);
    }
}
