import java.util.Random;
import java.util.stream.*;

public class RacingGame {
    private int racingCount;
    private Car[] cars;

    public RacingGame(int racingCount, Car[] cars) {
        this.racingCount = racingCount;
        this.cars = cars;
    }

    public int createRandom() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public void runGames() {
        for (int i = 0; i < racingCount; i++) {
            Stream.of(cars)
                    .forEach(car->
                            car.tryMove(createRandom()));
        }
    }

}
