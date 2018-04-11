package racingcar;

public class Car {

    private int position;
    private String carName;

    public Car(String carName) {
        this.carName = carName;
    }

    public int getPosition() {
        return position;
    }

    public String getCarName() {
        return carName;
    }

    void addPosition(int randomValue) {
        if(randomValue >= 4)
            position++;
    }

    boolean isMatchPosition(int topPosition) {
        if(position == topPosition)
            return true;
        return false;
    }

    int getTopPosition(int currentTopPosition) {
        if(position <= currentTopPosition)
            return currentTopPosition;
        return position;
    }

}
