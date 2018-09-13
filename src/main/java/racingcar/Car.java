package racingcar;

public class Car {
    public static final String DASH = "-";
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

    public void showCarPosition() {
        for (int i = 0; i < carPosition; i++) {
            System.out.print(DASH);  // print userPosition
        }
    }

    public boolean hasSamePos(int pos) {
        if (carPosition == pos) {
           return true;
        }
        return false;
    }

    public int findMaxPos(Car car, int maxPos) {
        if (car.carPosition > maxPos) {
            return car.carPosition;
        }
        return maxPos;
    }

}
