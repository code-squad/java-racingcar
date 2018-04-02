package racingcar;

import java.util.Random;

public class RacingGame {

    private static final int CANNABLE_MOVE_NUMBER = 4;
    private RacingGameInfoDTO racingGameInfo;
    private Random random;
    private int[] carPositions;

    public RacingGame(RacingGameInfoDTO racingGameInfo) {
        if (racingGameInfo == null || racingGameInfo.getCountOfCar() == 0) {
            throw new IllegalArgumentException();
        }
        this.racingGameInfo = racingGameInfo;
        random = new Random();
        carPositions = new int[racingGameInfo.getCountOfCar()];
    }

    public int[] moveCar() {
        for (int carNumber = 0; carNumber < racingGameInfo.getCountOfCar(); carNumber++) {
            if (isMoving(getRandomValue())) {
                carPositions[carNumber]++;
            }
        }
        return carPositions;
    }

    static boolean isMoving(int number) {
        return  number >= CANNABLE_MOVE_NUMBER;
    }

    public int getRandomValue() {
        return random.nextInt(10);
    }
}
