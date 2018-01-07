package racinggame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

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
        IntStream.range(0,count).forEachOrdered(i -> cars.forEach(car -> car.move(new Random().nextInt(10))));
    }

    public void racingResult() {
        for (Car car : cars) {
            car.printResult();
        }
    }
}
