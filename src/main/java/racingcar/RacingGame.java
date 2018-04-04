package racingcar;

import java.util.List;
import java.util.Random;

public class RacingGame {

    private static final int CANNABLE_MOVE_NUMBER = 4;
    private Random random;
    private GameResult gameResult;
    private int countOfCar;

    public RacingGame(List<Car> carList) {
        if (carList == null || carList.size() == 0) {
            throw new IllegalArgumentException();
        }
        random = new Random();
        gameResult = new GameResult();
        gameResult.setCarList(carList);
        countOfCar = carList.size();
    }

    public GameResult moveCar() {
        for (int carNumber = 0; carNumber < countOfCar; carNumber++) {
            if (isMoving(getRandomValue())) {
                gameResult.moveCar(carNumber);
            }
        }
        return gameResult;
    }

    static boolean isMoving(int number) {
        return  number >= CANNABLE_MOVE_NUMBER;
    }

    public int getRandomValue() {
        return random.nextInt(10);
    }
}
