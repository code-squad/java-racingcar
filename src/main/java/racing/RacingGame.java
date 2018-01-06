package racing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RacingGame {

    private final Car[] cars;
    private final int times;

    public RacingGame(Car[] cars, int times) {
        this.cars = cars;
        this.times = times;
    }

    public List<Integer> moveAllCars() {
        return Arrays.stream(cars)
                     .map(rc -> IntStream.range(0, times)
                                         .map(i -> rc.move())
                                         .sum())
                     .collect(Collectors.toList());
    }
}
