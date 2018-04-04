package racingcar;

public class Car {
    private String carName;
    private int moveDistance;

    public String getCarName() {
        return carName;
    }

    public Car setCarName(String carName) {
        this.carName = carName;
        return this;
    }

    public int getMoveDistance() {
        return moveDistance;
    }

    public Car setMoveDistance(int moveDistance) {
        this.moveDistance = moveDistance;
        return this;
    }
}
