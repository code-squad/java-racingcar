package racingcar;

import java.util.ArrayList;
import java.util.List;

public class GameResult {
    private List<Car> carList;
    private int topDistance;

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public void moveCar(int carIndex) {
        Car currentCar = carList.get(carIndex);
        currentCar.setMoveDistance(currentCar.getMoveDistance() + 1);
        topDistance = Math.max(topDistance, currentCar.getMoveDistance());
    }

    public List<String> getCarRacingWinner() {
        List<String> winnerList = new ArrayList<String>();
        for (Car car : carList) {
            if (topDistance == car.getMoveDistance()) {
                winnerList.add(car.getCarName());
            }
        }
        return winnerList;
    }
}
