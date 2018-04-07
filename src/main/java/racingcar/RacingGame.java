package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingGame {

    private int countOfCar;
    private List<Car> cars;

    public RacingGame(List<Car> cars) {
        if (cars == null || cars.size() == 0) {
            throw new IllegalArgumentException();
        }
        this.cars = cars;
        countOfCar = cars.size();
    }

    public List<Car> moveCar() {
        for (int carNumber = 0; carNumber < countOfCar; carNumber++) {
            cars.get(carNumber).moveCar();
        }
        return cars;
    }

    public String getCarRacingWinner() {
        return joinString(findWinnersNames(cars, getTopDistnace()));
    }

    private List<String> findWinnersNames(List<Car> cars, int topDistance) {
        List<String> winners = new ArrayList<>();

        for (Car car : cars) {
            if (car.matchDistance(topDistance)) {
                winners.add(car.getCarName());
            }
        }

        return winners;
    }

    private String joinString(List<String> winnerNames) {
        return String.join(",", winnerNames);
    }

    public int getTopDistnace() {
        int result = 0;
        for (Car car : cars) {
            result = Math.max(result, car.getMoveDistance());
        }
        return result;
    }
}
