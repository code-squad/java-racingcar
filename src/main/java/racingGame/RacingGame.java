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

    public void printCar() {
        for (Car car : carList) {
            System.out.println(car.resultString());
        }
    }

    public List<Car> getCarList() {
        return carList;
    }
}
