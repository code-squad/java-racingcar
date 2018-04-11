package racingGame;

import java.util.List;
import java.util.ArrayList;

public class GameResult {
    private List<Car> cars;

    public GameResult(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getWinnerCars() {
        List<Car> winnerCars  = new ArrayList();
        winnerCars.add(cars.get(0));
        int carCount = cars.size();
        for(int i=1; i<carCount; ++i) {
            addWinnerCar(winnerCars, cars.get(i));
        }
        return winnerCars;
    }

    static void addWinnerCar(List<Car> winnerCars, Car car) {
        Car winnerCar = winnerCars.get(0);
        if(isFasterPosition(winnerCar, car))
            return;
        if(isSamePosition(winnerCar, car)) {
            winnerCars.add(car);
            return;
        }
        winnerCars.clear();
        winnerCars.add(car);
    }

    static boolean isFasterPosition(Car winnerCar, Car car) {
        return winnerCar.getPosition() > car.getPosition();
    }

    static boolean isSamePosition(Car winnerCar, Car car) {
        return winnerCar.getPosition() == car.getPosition();
    }
}
