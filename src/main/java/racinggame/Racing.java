package racinggame;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Racing {
    private List<Car> cars;

    private int count;

    public Racing(List<Car> cars) {
        this.cars = cars;
    }

    public Racing(int count, String[] carNames) {
        this.cars = createCars(carNames);
        this.count = count;
    }

    public List<Car> getCars() {
        return cars;
    }

    private List<Car> createCars(String[] carNames) {
        cars = new ArrayList<>();
        IntStream.range(0, carNames.length).forEachOrdered(i -> cars.add(new Car(carNames[i])));
        return cars;
    }

    public void racing() {
        IntStream.range(0,count).forEachOrdered(i -> cars.forEach(car -> car.move(new Random().nextInt(10))));
    }

    public List<Car> getWinnerCars() {
        return cars.stream().filter(car -> car.matchPosition(getMaxPosition())).collect(Collectors.toList());
    }

    private int getMaxPosition() {
        return cars.stream().mapToInt(Car::getPosition).max().getAsInt();
    }

}
