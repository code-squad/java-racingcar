package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingGame {

    private static final int CANNABLE_MOVE_NUMBER = 4;
    private Random random;
    private int countOfCar;
    private List<Car> cars;

    public RacingGame(List<Car> cars) {
        if (cars == null || cars.size() == 0) {
            throw new IllegalArgumentException();
        }
        random = new Random();
        this.cars = cars;
        countOfCar = cars.size();
    }

    public List<Car> moveCar() {
        for (int carNumber = 0; carNumber < countOfCar; carNumber++) {
            if (isMoving(getRandomValue())) {
                Car currentCar = cars.get(carNumber);
                currentCar.moveCar();
            }
        }
        return cars;
    }

    static boolean isMoving(int number) {
        return  number >= CANNABLE_MOVE_NUMBER;
    }

    public int getRandomValue() {
        return random.nextInt(10);
    }

    public void moveCar(int carIndex) {
        Car currentCar = cars.get(carIndex);
        currentCar.moveCar();
    }

    public List<String> getCarRacingWinner() {
        List<String> winners = new ArrayList<String>();
        int topDistance = getTopDistnace();

        for (Car car : cars) {
            if (car.matchDistance(topDistance)) {
                winners.add(car.getCarName());
            }
        }
        return winners;
    }

    public int getTopDistnace() {
        int result = 0;
        for (Car car : cars) {
            result = Math.max(result, car.getMoveDistance());
        }
        return result;
    }
}
