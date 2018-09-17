package racingcar;

import java.util.ArrayList;
import java.util.Random;

public class Racing {
    private static final int CONDITION = 4;

    public ArrayList<Car> runGame(ArrayList<Car> cars) {
        int time = InputView.inputTime();
        for (int i = 0; i < time; i++) {
            playGame(cars);
        }
        return cars;
    }

    private void playGame(ArrayList<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            moveJudge(cars, i);
        }
    }

    private void moveJudge(ArrayList<Car> cars, int i) {
        if (makeRandomNum() > CONDITION) {
            cars.get(i).position++;
        }
    }

    private int makeRandomNum() {
        Random random = new Random();
        return (random.nextInt(10) - 1);
    }
}