package racingGame;

import java.util.ArrayList;

public class Game {
    String carNames;
    ArrayList<Car> cars;

    public Game(String carNames) {
        this.carNames = carNames;
        cars = getCars(carNames);
    }

    public GameResult move() { //전진 시도
        eachCarMove(cars);
        return new GameResult(cars);
    }

    private void eachCarMove(ArrayList<Car> cars) {
        for(Car car : cars) {
            car.move();
        }
    }

    static ArrayList<Car> getCars(String carNames) {
        ArrayList<Car> cars = new ArrayList();
        String[] carNameArr = carNames.split(",");
        for(int i=0; i<carNameArr.length; ++i) {
            cars.add(new Car(carNameArr[i]));
        }
        return cars;
    }

}
