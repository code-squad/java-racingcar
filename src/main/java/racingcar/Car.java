package racingcar;

public class Car {
    public static final String DASH = "-";

    private String carName;
    private int carPosition;

    public Car(String carName, int carPosition) {
        this.carName = carName;
        this.carPosition = carPosition;
    }

    public void addPosition() {
        carPosition++;
    }

    public String getCarName() {
        return carName;
    }

    public void showCarPosition() {
        for (int i = 0; i < carPosition; i++) {
            System.out.print(DASH);  // print userPosition
        }
    }

    public int areMoreFarThan(Car otherCar) {
        int gap = carPosition - otherCar.carPosition;
        if (gap == 0) {
            return 0;
        } else if (gap < 0) {  // otherCar is more far than me
            return -1;
        } else {
            return 1;  // This car is more far than other
        }
    }

}
