package racingcar;

public class CarInfo {
    private String carName;
    private int moveDistance;

    public String getCarName() {
        return carName;
    }

    public CarInfo setCarName(String carName) {
        this.carName = carName;
        return this;
    }

    public int getMoveDistance() {
        return moveDistance;
    }

    public CarInfo setMoveDistance(int moveDistance) {
        this.moveDistance = moveDistance;
        return this;
    }
}
