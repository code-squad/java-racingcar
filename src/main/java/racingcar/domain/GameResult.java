package racingcar.domain;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameResult {

    private List<Car> cars;
    private StringBuilder winnerNames;

    public GameResult(List<Car> cars) {
        this.cars = cars;
    }

    public int getCarPostionLength() {
        return cars.size();
    }

    public int getSingleCarPosition(int line) {
        return cars.get(line).getCarPostion();
    }

    public String getSingleCarName(int line) {
        return cars.get(line).getCarName();
    }

    public List<Car> getCars() { return cars; }

    public StringBuilder getWinnerNames() {

        Collections.sort(cars);
        int maxCarPosition = cars.get(0).getCarPostion();

        for(Car car:cars) {
            addSameMaxCarPositon(maxCarPosition, car);
        }

        return this.winnerNames;
    }

    private void addSameMaxCarPositon(int maxCarPosition, Car car) {

        if(car.matchPosition(maxCarPosition)) {
            addWinnerName(car);
        }
    }

    private void addWinnerName(Car car) {

        if(winnerNames == null) {
            winnerNames = new StringBuilder();
            winnerNames.append(car.getCarName());
            return;
        }

        winnerNames.append(", ").append(car.getCarName());
    }
}
