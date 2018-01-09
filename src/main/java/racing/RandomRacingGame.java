package racing;

import java.util.stream.IntStream;

public class RandomRacingGame extends RacingGame {

    public RandomRacingGame(String[] names, int times) {
        super(names, times);
    }

    @Override
    protected Car[] createCars(String[] names) {
        Car[] cars = new Car[names.length];
        IntStream.range(0, names.length)
                 .forEach(i -> cars[i] = new Car(RandomMoveStrategy.getInstance(), names[i]));

        return cars;
    }
}
