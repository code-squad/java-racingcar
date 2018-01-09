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

    private List<Car> createCars(String[] carNames) {
        cars = new ArrayList<>();
        IntStream.range(0, carNames.length).forEachOrdered(i -> cars.add(new Car(carNames[i])));
        return cars;
    }

    public void racing() {
        IntStream.range(0,count).forEachOrdered(i -> cars.forEach(car -> car.move(new Random().nextInt(10))));
    }

    public void racingResult() {
        cars.forEach(car -> car.printResult());
    }

    public List<Car> getWinnerCars() {
        return cars.stream().filter(car -> car.matchPosition(getMaxPosition())).collect(Collectors.toList());
    }

    public String getWinnerCarNames(List<Car> winners) {
        return winners.stream().map(car -> car.getName()) .collect(Collectors.joining(","));
    }
    private int getMaxPosition() {
        return cars.stream().mapToInt(Car::getPosition).max().getAsInt();
    }
}
