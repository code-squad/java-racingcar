package racing;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public abstract class RacingGame {
    private Car[] cars;
    private int times;

    protected RacingGame(String[] names, int times) {
        checkArguments(names, times);
        this.cars = createCars(names);
        this.times = times;
    }

    protected RacingGame(Car[] cars, int times) {
        this.cars = cars;
        this.times = times;
    }

    public List<RacingResult> doRacing() {
        return Arrays.stream(cars)
                     .map(this::doRacing)
                     .collect(Collectors.toList());
    }

    private RacingResult doRacing(Car car) {
        int position = IntStream.range(0, times)
                                .map(i -> car.move())
                                .sum();

        return new RacingResult(car.getName(), position);
    }

    protected abstract Car[] createCars(String[] names);

    private void checkArguments(String[] names, int times) {
        if (ArrayUtils.isEmpty(names)) {
            throw new IllegalArgumentException("names should not be empty");
        }
        if (times <= 0) {
            throw new IllegalArgumentException("times should bigger than 0");
        }
    }
}
