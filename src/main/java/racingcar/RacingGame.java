package racingcar;

import java.util.Random;

public class RacingGame {

    private static final int CANNABLE_MOVE_NUMBER = 4;
    private Random random;
    private int[] carPositions;
    private int countOfCar;

    public RacingGame(int countOfCar) {
        if (countOfCar == 0) {
            throw new IllegalArgumentException();
        }
        this.countOfCar = countOfCar;
        random = new Random();
        carPositions = new int[countOfCar];
    }

    public int[] moveCar() {
        for (int carNumber = 0; carNumber < countOfCar; carNumber++) {
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
