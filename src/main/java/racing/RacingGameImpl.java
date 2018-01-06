package racing;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RacingGameImpl implements RacingGame {

    private Car[] cars;
    private int times;

    public RacingGameImpl(Car[] cars, int times) {
        checkArguments(cars, times);
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

    private void checkArguments(Car[] cars, int times) {
        if (ArrayUtils.isEmpty(cars)) {
            throw new IllegalArgumentException("cars should not be empty");
        }
        if (times <= 0) {
            throw new IllegalArgumentException("times should bigger than 0");
        }
    }
}
