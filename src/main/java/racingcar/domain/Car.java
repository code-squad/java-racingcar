package racingcar.domain;

public class Car implements Comparable<Car>{

    private String printCarPosition = "";
    private String carName;
    private int carPostion;

    public Car(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public int getCarPostion() {
        return carPostion;
    }

    public String getPrintCarPosition() {
        return printCarPosition;
    }

    public void move(int randomValue) {
        if(randomValue >= RacingGame.RULENUM) {
            carPostion += 1;
            printCarPosition += "-";
        }
    }

    public boolean matchPosition(int maxCarPostion) {
        return carPostion == maxCarPostion;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carPostion=" + carPostion +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return o.carPostion - this.carPostion;
    }
}
