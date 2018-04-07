package racingcar;

public class Car {
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

    public void moveCar() {
        this.moveDistance++;
    }

    public boolean matchDistance(int topDistance) {
        return this.moveDistance == topDistance;
    }
}
