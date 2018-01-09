package racing.model;

import java.util.Arrays;
import java.util.List;
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

        this.cars = Arrays.stream(carNames)
                        .map(Car::newInstance)
                        .collect(Collectors.toList());
        this.tryCount = tryCount;
    }

    public List<Car> getCars() {
        return cars;
    }

    public int getTryCount() {
        return tryCount;
    }
}
