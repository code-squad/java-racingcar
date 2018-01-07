package racing.model;

import java.util.ArrayList;
import java.util.List;

public class GameConfiguration {
    private List<Car> cars;
    private int tryCount;

    public GameConfiguration(String[] carNames, int tryCount) {
        this.cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(Car.newInstance(carName));
        }
        this.tryCount = tryCount;
    }

    public List<Car> getCars() {
        return cars;
    }

    public int getTryCount() {
        return tryCount;
    }
}
