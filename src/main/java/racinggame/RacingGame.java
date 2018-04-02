package racinggame;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

public class RacingGame {

    private final static int MAX_LIMIT = 9;
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
        car.move(getRandomInt());
    }

    void printRacingResult() {
        List<Integer> carPositions = carList.stream().map(Car::getPosition).collect(Collectors.toList());
        racingGameView.printView(carPositions);
    }

    private int getRandomInt() {
        return new Random().nextInt(MAX_LIMIT);
    }
}
