package racingcar.domain;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class GameResult {

    //단위테스트를 위한 SetMethod
    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    private List<Car> carList;
    private List<Car> winnerList = new ArrayList<>();

    public GameResult(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> getCarPosition() {
        return carList;
    }

    public List<Car> getWinnerList() {
        return winnerList;
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

    public void addWinner(Car car) {
        winnerList.add(car);
    }
}
