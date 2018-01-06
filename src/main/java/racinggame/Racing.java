package racinggame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Racing {
    private List<Car> cars;

    private int count;

    public Racing(int carNumber, int count) {
        this.cars = createCars(carNumber);
        this.count = count;
    }

    private List<Car> createCars(int carNumber) {
        cars = new ArrayList<>();
        for (int i=0; i <carNumber; i++) {
            cars.add(new Car());
        }
        return cars;
    }

    public void racing() {
        for (int i = 0 ; i < count ; i++) {
            for (Car car : cars) {
                car.move(new Random().nextInt(10));
            }
        }
    }

    public void racingResult() {
        for (Car car : cars) {
            car.printPosition();
        }
    }
}
