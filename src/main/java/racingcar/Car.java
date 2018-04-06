package racingcar;

public class Car {
    private String carName;
    private int move;

    public Car(String carName, int move) {
        this.carName = carName;
        this.move = move;
    }

    public void carMove(int move) {
        this.move = move;
    }

    public String returnCarName() {
        return carName;
    }

    public int returnCarMove() {
        return move;
    }

}
