package racing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomRacingGame implements RacingGame {

    private final Car[] randomCars;

    private final int times;

    private final MoveStrategy strategy = new RandomMoveStrategy();

    public RandomRacingGame(int times, int numberOfCars) {
        this.randomCars = new Car[numberOfCars];
        this.times = times;

        IntStream.range(0, numberOfCars)
                 .forEach(i -> randomCars[i] = new CarImpl(strategy));
    }

    @Override
    public List<Integer> move() {
        return Arrays.stream(randomCars)
                     .map(rc -> IntStream.range(0, times)
                                         .map(i -> rc.move())
                                         .sum())
                     .collect(Collectors.toList());
    }
}
