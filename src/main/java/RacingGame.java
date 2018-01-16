import java.util.ArrayList;
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
                    .forEach(car->
                            car.tryMove(createRandom()));
        }
    }

    public List<Car> getCars() {
        return this.cars;
    }

}
