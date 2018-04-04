package racingcar.domain;

import racingcar.domain.Car;

import java.util.List;

public class GameResult {

    private List<Car> carList;

    public GameResult(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> getCarPosition() {
        return carList;
    }

    public int getCarPostionLength() {
        return carList.size();
    }

    public int getSingleCarPosition(int line) {
        return carList.get(line).getCarPostion();
    }

    public String getSingleCarName(int line) {
        return carList.get(line).getCarName();
    }
}
