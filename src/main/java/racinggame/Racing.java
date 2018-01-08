package racinggame;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Racing {
    private List<Car> cars;

    private int count;

    public Racing(int count, String[] carNames) {
        this.cars = createCars(carNames);
        this.count = count;
    }

    private List<Car> createCars(String[] carNames) {
        cars = new ArrayList<>();
        IntStream.range(0, carNames.length).forEachOrdered(i -> cars.add(new Car(carNames[i])));
        return cars;
    }

    public void racing() {
        IntStream.range(0,count).forEachOrdered(i -> cars.forEach(car -> car.move(new Random().nextInt(10))));
    }

    public void racingResult() {
        for (Car car : cars) {
            car.printResult();
        }
//        Comparator.comparingInt(Car::getPosition).reversed();
//        cars.stream().findFirst().get().getName();

    }
}
