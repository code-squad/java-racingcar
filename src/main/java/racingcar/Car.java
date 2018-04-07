package racingcar;

import java.util.Random;

public class Car {
    private Random random = new Random();
    private static final int CANNABLE_MOVE_NUMBER = 4;
    private String carName;
    private int moveDistance;

    public Car(String carName) {
        this.carName = carName;
    }

    public Car(String carName, int moveDistance) {
        this.carName = carName;
        this.moveDistance = moveDistance;
    }

    public String getCarName() {
        return carName;
    }

    public int getMoveDistance() {
        return moveDistance;
    }

    public boolean matchDistance(int topDistance) {
        return this.moveDistance == topDistance;
    }

    public void moveCar() {
        if(isMoving(getRandomValue())) {
            this.moveDistance++;
        }
    }

    static boolean isMoving(int number) {
        return  number >= CANNABLE_MOVE_NUMBER;
    }

    private int getRandomValue() {
        return random.nextInt(10);
    }
}
