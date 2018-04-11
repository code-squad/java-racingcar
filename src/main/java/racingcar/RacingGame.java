package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingGame {

    private List<Car> cars;
    private Random random = new Random();

    public RacingGame(String[] carNames) {
        cars = createCars(carNames);

    }

    private List<Car> createCars(String[] carNames) {
        cars = new ArrayList<Car>();
        for(String carName : carNames) {
            cars.add(new Car(carName));
        }

        return cars;
    }

    List<Car> move() {
        for(int i = 0; i < cars.size(); i++) {
            cars.get(i).addPosition(getRandomValue());
        }

        return cars;
    }

    int getRandomValue() {
        return random.nextInt(10);
    }

    int getRaceTopPosition() {
        int topPosition = 0;
        for(int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            topPosition = car.getTopPosition(topPosition);
        }

        return topPosition;
    }

    List<String> getWinnnersRacing() {
        List<String> winners = new ArrayList<String>();

        int topPosition = getRaceTopPosition();
        for(int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            addWinners(winners, topPosition, car);
        }

        return winners;
    }

    private void addWinners(List<String> winners, int topPosition, Car car) {
        if(car.isMatchPosition(topPosition)) {
            winners.add(car.getCarName());
        }
    }

}
