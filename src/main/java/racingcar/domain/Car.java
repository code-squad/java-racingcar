package racingcar.domain;

public class Car {

    private String carName;
    private int carPostion;

    public Car(String carName) {
        this.carName = carName;
    }

    public void addCarPostion() {
        carPostion++;
    }

    public String getCarName() {
        return carName;
    }

    public int getCarPostion() {
        return carPostion;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carPostion=" + carPostion +
                '}';
    }
}
