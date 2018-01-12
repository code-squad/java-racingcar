package racingGame;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private int time; // 시도회수
    private List<Car> carList = new ArrayList<>(); // 차 list

    public RacingGame(int time, String carName) {
        this.time = time;

        this.carList = GameHelperUtil.getCarNames(carName);
    }

    public void runGame() {
        for(int i = 0; i < time; i++) {
            move();
        }
    }

    private void move() {
        for (Car car : carList) {
            int random = (int) (Math.random() * 10);
            car.rePosition(random);
        }
    }

    public List<Car> getCars() {
        return carList;
    }

    public List<String> getResult() {
        List<String> results = new ArrayList<>();
        for (Car car : this.carList) {
            results.add(car.resultString());
        }
        return results;
    }
}
