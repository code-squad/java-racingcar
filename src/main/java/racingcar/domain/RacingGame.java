package racingcar.domain;

import racingcar.domain.interfaces.Car;
import racingcar.domain.interfaces.PointMaker;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sangsik.kim
 */
public class RacingGame {
    private List<Car> cars;
    private PointMaker pointMaker;

    public RacingGame(List<String> names) {
        this.cars = new ArrayList<>();
        this.pointMaker = new RandomPointMaker();
        generateCars(names);
    }


    public GameResult run() {
        GameResult gameResult = new GameResult();
        for (Car car : this.cars) {
            gameResult.add(car.move(this.pointMaker.generate()));
        }
        return gameResult;
    }

    private void generateCars(List<String> names) {
        for (String name : names) {
            this.cars.add(new BasicCar(name));
        }
    }
}
