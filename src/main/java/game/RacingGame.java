package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingGame {

    private List<Car> cars;

    public RacingGame(int carNo) {
        this.cars = initCars(carNo);
    }

    List<Car> initCars(int carCount) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < carCount; i++) {
            cars.add(new Car(GameRule.START_POSITION));
        }
        return cars;
    }

    public GameResult move(int tryNo) {
        final Random random = new Random();
        List<List<Car>> histories = new ArrayList<>();

        for (int i = 0; i < tryNo; i++) {
            List<Car> history = new ArrayList<>();

            cars.forEach(car -> {
                int randomValue = random.nextInt(GameRule.MAX_RANDOM_VALUE);

                car.move(randomValue);

                history.add(new Car(car));
            });

            histories.add(history);
        }
        return new GameResult(histories);
    }
}
