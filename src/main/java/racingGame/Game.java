package racingGame;

import java.util.List;
import java.util.ArrayList;

public class Game {
    private List<Car> cars;

    public Game(String carNames) {
        cars = getCarsByCarNames(carNames);
    }

    static List<Car> getCarsByCarNames(String carNames) {
        List<Car> cars = new ArrayList();
        String[] carNameArr = carNames.split(",");
        for(int i=0; i<carNameArr.length; ++i) {
            cars.add(new Car(carNameArr[i]));
        }
        return cars;
    }

    public GameResult move() { //전진 시도
        eachCarMove(cars);
        return new GameResult(cars);
    }

    private void eachCarMove(List<Car> cars) {
        for(Car car : cars) {
            car.move();
        }
    }



}
