package racinggame.domain;

import racinggame.view.RacingGameView;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

public class RacingGame {

    private final static int MAX_LIMIT = 9;
    private List<Car> carList;
    private RacingGameView racingGameView;

    public RacingGame(List<Car> carList, RacingGameView racingGameView) {
        if (isNull(carList) || carList.isEmpty() || isNull(racingGameView))
            throw new IllegalArgumentException();

        this.carList = carList;
        this.racingGameView = racingGameView;
    }

    public void start() {
        carList.forEach(this::move);
        printRacingResult();
    }

    private void move(Car car) {
        car.move(getRandomInt());
    }

    public List<String> getWinnerNames() {
        int maxValue = carList.stream()
                .max(Comparator.comparing(Car::getPosition))
                .get()
                .getPosition();

        return carList.stream()
                .filter(car -> car.getPosition() == maxValue)
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    private void printRacingResult() {
        List<String> carNames = new ArrayList<>();
        List<Integer> carPositions = new ArrayList<>();

        carList.forEach(car-> {
            carNames.add(car.getName());
            carPositions.add(car.getPosition());
        });

        racingGameView.printView(carNames, carPositions);
    }

    private int getRandomInt() {
        return new Random().nextInt(MAX_LIMIT);
    }
}
