package game.racingGame;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
public class RacingGame {

    private List<Car> cars;
    private Integer trialTime;
    private Random random;

    public RacingGame(Integer numberOfCar, Integer trialTime) {
        this.random = new Random();
        this.cars = new ArrayList();

        for (int i = 0; i < numberOfCar; i++) {
            this.cars.add(new Car());
        }

        this.trialTime = trialTime;
    }

    public void move() {
        for (Car car : cars) {
            for (int i = 0; i < trialTime; i++) {
                car.move(getRandom());
            }
        }
    }

    private Integer getRandom() {
        return random.nextInt(10);
    }
}
