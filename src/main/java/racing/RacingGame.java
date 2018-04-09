package racing;

import racing.player.Car;
import racing.result.GameResult;

import java.util.*;

public class RacingGame {
    public List<Car> cars;

    public RacingGame(String carNames) {
        ready(carNames);
    }

    private void ready(String carNames) {
        cars = new ArrayList<>();
        for(String name: carNames.split(" ")) {
            cars.add(new Car(name));
        }
    }

    public GameResult nextTurn() {
        for(Car car: cars) {
            car.move(getRandomValue());
        }
        return new GameResult(cars);
    }

    private static int getRandomValue() {
        return new Random().nextInt(10);
    }
}
