import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.*;

public class RacingGame {
    private int racingCount;
    private List<Car> cars;

    public RacingGame(int racingCount, List<Car> cars) {
        this.racingCount = racingCount;
        this.cars = cars;
    }

    public int createRandom() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public void runGames() {
        for (int i = 0; i < racingCount; i++) {
            cars.stream()
                    .forEach(car ->
                            car.tryMove(createRandom()));
        }
    }

    public int getMax() {
        int max = 0;
        for (Car car : cars) {
            max = Integer.max(car.getPosition(), max);
        }
        return max;
    }

    public String[] getWinners() {
        String[] winners;
        final int max = getMax();

        winners = cars.stream()
                .filter(car -> max == car.getPosition())
                .map(car -> car.getName())
                .toArray(String[]::new);

        return winners;
    }

    public List<Car> getCars() {
        return this.cars;
    }

}
