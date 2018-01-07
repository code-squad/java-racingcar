package racingGame;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private int time; // 시도회수

    private List<Car> carList = new ArrayList<>(); // 차 list


    public RacingGame(int time, int carNum) {
        this.time = time;

        for(int i =0; i<carNum; i++) {
            carList.add(new Car());
        }
    }

    public void move() {

        for(int i = 0; i < time; i++) {
            runGame();
        }
        printGameResult();
    }

    public void printGameResult() {
        for (Car car : carList) {
            car.printCarMove();
        }
    }

    private void runGame() {

        for (Car car : carList) {
            int random = (int) (Math.random() * 10);
            car.rePosition(random);
        }

    }

}
