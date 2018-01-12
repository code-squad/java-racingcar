package racing.model;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GameConfiguration {
    private List<Car> cars;
    private int tryCount;

    public GameConfiguration(String[] carNames, int tryCount) {
        // jdk 7
//        this.cars = new ArrayList<>();
//        for (String carName : carNames) {
//            cars.add(Car.newInstance(carName));
//        }

        this.cars = makeCars(carNames);
        this.tryCount = tryCount;
    }

    public GameConfiguration(String carNames, int turn) {
        this.cars = makeCars(carNames);
        this.tryCount = turn;
    }

    private static List<Car> makeCars(String[] carNames) {
        return Arrays.stream(carNames)
                        .map(Car::newInstance)
                        .collect(Collectors.toList());
    }

    public static List<Car> makeCars(String carNames) {
        return makeCars(carNames.split(" "));
    }

    public List<Car> getCars() {
        return cars;
    }

    public int getTryCount() {
        return tryCount;
    }
}
