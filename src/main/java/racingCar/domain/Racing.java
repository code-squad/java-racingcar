package racingCar.domain;

import java.util.*;

public class Racing {
    private List<String> names = new ArrayList<>();
    private List<Car> gameResult;
    private int time;

    public Racing(List<String> names, int time) {
        this.names = names;
        this.time = time;
    }

    public void race() {
        gameResult = new ArrayList<>();
        for (String carName:names) {
             Car car = new Car(carName);
             moveAndStop(car);
             gameResult.add(car);
        }

    }

    private void moveAndStop(Car car) {
        for (int tryCount = 0; tryCount < time; tryCount++) {
            car.move(makeRandomNumber());
        }
    }

    public int makeRandomNumber() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public List<Car> getGameResult() {
        return gameResult;
    }
}
