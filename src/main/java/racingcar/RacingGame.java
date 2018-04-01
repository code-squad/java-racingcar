package racingcar;

import java.util.Random;

public class RacingGame {

    private RacingGameInfoVO racingGameInfo;
    private int[] carPositions;
    private Random random = new Random();
    private static final int CANNABLE_MOVE_NUMBER = 4;

    void startGame () {
        inputData();
        carPositions = new int[racingGameInfo.getCountOfCar()];
        for (int count = 0; count < racingGameInfo.getTestCase(); count++) {
            moveCar();
            ResultView.printStatus(carPositions);
        }
    }

    private void moveCar() {
        for (int carNumber = 0; carNumber < racingGameInfo.getCountOfCar(); carNumber++) {
            if (isMoving(getRandomValue())) {
                carPositions[carNumber]++;
            }
        }
    }

    boolean isMoving(int number) {
        return  number >= CANNABLE_MOVE_NUMBER;
    }

    private void inputData() {
        racingGameInfo = InputView.inputDataAndView();
    }

    public int getRandomValue() {
        return random.nextInt(10);
    }
}
