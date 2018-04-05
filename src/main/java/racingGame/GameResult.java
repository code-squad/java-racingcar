package racingGame;

import java.util.ArrayList;

public class GameResult {
    ArrayList<Car> cars;

    public GameResult(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    static ArrayList<Car> getWinnerCars(GameResult result) {
        ArrayList<Car> cars = result.getCars();
        ArrayList<Car> winnerCars  = new ArrayList();

        winnerCars.add(cars.get(0));
        int carCount = cars.size();
        for(int i=1; i<carCount; ++i) {
            addWinnerCar(winnerCars, cars.get(i));
        }
        return winnerCars;
    }

    static void addWinnerCar(ArrayList<Car> winnerCars, Car car) {
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
