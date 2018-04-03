package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingGame {
    private static final int BASIC_NUMBER_OF_CAR = 3;

    private static final int SUFFICIENT_SPEED = 4;

    public List<Integer> carPositions;

    public RacingGame() {
        this(BASIC_NUMBER_OF_CAR);
    }

    public RacingGame(int numberOfCar) {
        ready(numberOfCar);
    }

    private void ready(int numberOfCar) {
        this.carPositions = new ArrayList();
        for (; numberOfCar > 0; numberOfCar--) {
            this.carPositions.add(1);
        }
    }

    public GameResult move() {
        for (int i = 0; i < carPositions.size(); i++) {
            moveFoward(i);
        }
        GameResult result = new GameResult();
        result.snapshot(this.carPositions);
        return result;
    }

    public void moveFoward(int idx) {
        if (canIGo()) {
            carPositions.set(idx, carPositions.get(idx) + 1);
        }
    }

    private static boolean canIGo() {
        int speed = fullAccel();
        return speed >= SUFFICIENT_SPEED ? true : false;
    }

    private static int fullAccel() {
        return new Random().nextInt();
    }
}
