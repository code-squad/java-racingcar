package racingcar;

public class Car {
    public static final int POS_STD = 4;

    private String carName;
    private int carPosition;

    public Car(String carName, int carPosition) {
        this.carName = carName;
        this.carPosition = carPosition;
    }

    public void addPosition(int posVal) {
        if (posVal >= POS_STD) {
            carPosition++;
        }
    }

    public String getCarName() {
        return carName;
    }

    // used for testing
    public int getCarPosition() {
        return carPosition;
    }

    public boolean hasSamePos(int pos) {
        return carPosition == pos;
    }

    public int findMaxPos(int maxPos) {
        return carPosition > maxPos ? carPosition : maxPos;
    }

}
