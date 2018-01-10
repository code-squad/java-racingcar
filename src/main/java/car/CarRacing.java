package car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static car.RacingUtils.REGEX;

public class CarRacing {
    private static final Random RANDOM = new Random();
    private List<Car> cars;
    private int tryCount;

    private CarRacing(String names[], int tryCount) {
        checkArguments(names, tryCount);
        this.cars = new ArrayList<>();
        createCarsByName(names);
        this.tryCount = tryCount;
    }

    public static CarRacing readyForRacing(String names[], int tryCount) {
        return new CarRacing(names, tryCount);
    }

    public List<Car> startRacing() {
        return cars.stream().map(this::startRacing).collect(Collectors.toList());
    }

    public Car startRacing(Car car) {
        IntStream.range(0, tryCount).forEach(i -> car.randomMove(RANDOM.nextInt(10)));
        return car;
    }

    public int getMaxMove() {
        int max = 0;
        for(Car car : cars) {
            max = Math.max(max, car.getMove());
        }
        return max;
    }

    public void createCarsByName(String names[]) {
        IntStream.range(0, names.length).forEach(i -> cars.add(new Car(names[i])));
    }

    public String getWinners() {
        int max = getMaxMove();
        return cars.stream().filter(car -> car.getMove() == max).map(Car::getName).collect(Collectors.joining(REGEX));
    }

    private void checkArguments(String names[], int tryCount) {
        if(names == null) { throw new IllegalArgumentException(); }
        if(tryCount <= 0) { throw new IllegalArgumentException(); }
    }
}
