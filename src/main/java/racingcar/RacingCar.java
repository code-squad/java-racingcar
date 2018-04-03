package racingcar;

import java.util.Random;

public class RacingCar {

    private int[] carPositions;

    public RacingCar(int car) {
        this.carPositions = new int[car];
    }

    public int[] carPositionMove() {
        for (int j = 0; j < carPositions.length; j++) {
            carPositions[j] = moveCar(carPositions[j]);
        }
        return carPositions;
    }

    private int moveCar(int carPosition) {
        return returnRandom() >= 4 ? ++carPosition : carPosition;
    }

    public int returnRandom() {
        return (new Random().nextInt(9));
    }

}