package racingGame;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongjong-wan on 2018. 3. 31..
 */
public class RacingGame {


    private List<Car> cars;

    public RacingGame(List<Car> cars) {
        this.cars = cars;
    }

    public RacingGame(String carNames) {
        if (StringUtils.isBlank(carNames)) {
            throw new IllegalArgumentException();
        }
        cars = addCar(carNames);
    }

    private List<Car> addCar(String carNames) {
        if (StringUtils.isBlank(carNames)) {
            throw new IllegalArgumentException();
        }

        cars = new ArrayList<>();
        String[] carName = carNames.split(",");
        for (int i = 0; i < carName.length; i++) {
            cars.add(new Car(carName[i]));
        }
        return cars;
    }


    public List<Car> moveCars() {
        for(Car car : cars) {
            car.move(RandomGenerator.getRandomNum());
        }
        return cars;
    }



    public List<Car> findWinners() {
        int farthestPosition = findFarthestPosition();
        for (Car car : cars) {
            if(car.matchFarthestPosition(farthestPosition)) {
                car.setWinner(true);
            }
        }
        return cars;
    }

    public int findFarthestPosition() {
        int farthestPosition = 0;
        for (Car car : cars) {
            int carPosition = car.getPosition();
            if (farthestPosition < carPosition) {
                farthestPosition = carPosition;
            }
        }
        return farthestPosition;
    }

}