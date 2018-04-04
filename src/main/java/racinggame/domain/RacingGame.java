package racinggame.domain;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

public class RacingGame {

    private final static int MAX_LIMIT = 9;
    private List<Car> cars;

    public RacingGame(List<String> carNames) {
        if (isNull(carNames) || carNames.isEmpty())
            throw new IllegalArgumentException();

        this.cars = carNames.stream().map(Car::new).collect(Collectors.toList());
    }

    public void start() {
        cars.forEach(this::move);
    }

    private void move(Car car) {
        car.move(getRandomInt());
    }

    public List<Car> getCars() {
        return this.cars;
    }

    private int getRandomInt() {
        return new Random().nextInt(MAX_LIMIT);
    }
}
