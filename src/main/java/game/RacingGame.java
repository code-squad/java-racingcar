package game;

import car.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class RacingGame {
    private List<Car> cars;

    public RacingGame(int carsCount, int tryCount) {
        makeCars(carsCount);
        moveTry(tryCount);
    }

    private void makeCars(int count) {
        cars = new ArrayList<>();
        IntStream.range(0, count).forEach(i -> cars.add(new Car()));
    }

    private void moveTry(int tryCount) {
        IntStream.range(0, tryCount).forEach(i -> moveCars());
    }

    private void moveCars() {
        for (Car car : cars) {
            car.moveCar();
        }
    }

    public void resultPrint() {
        for (Car car : cars) {
            System.out.println(car.getPosition());
        }
    }
}
