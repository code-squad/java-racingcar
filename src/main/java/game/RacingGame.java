package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class RacingGame {

    private List<Car> cars;

    public RacingGame(String carName) {
        this.cars = initCars(carName);
    }

    static List<Car> initCars(String carNameWithComma) {
        List<String> carNames = Arrays.asList(carNameWithComma.split(","));
        List<Car> cars = new ArrayList<>();

        carNames.forEach(carName -> cars.add(new Car(GameRule.START_POSITION, carName)));
        return cars;
    }

    public GameResult move(int tryNo) {
        final Random random = new Random();
        GameResult gameResult = new GameResult();

        IntStream.range(0, tryNo)
                .forEach(i -> {
            List<Car> history = new ArrayList<>();

            cars.forEach(car -> {
                int randomValue = random.nextInt(GameRule.MAX_RANDOM_VALUE);

                car.move(randomValue);

                history.add(new Car(car.getPosition(), car.getName()));
            });

            gameResult.record(history);
        });

        return gameResult;
    }
}
