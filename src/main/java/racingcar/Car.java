package racingcar;

public class Car {
    private String carName;
    private int move;

    public Car(String carName, int move) {
        this.carName = carName;
        this.move = move;
    }

    public void carMove(int move) {
        if (move >= 4) {
            this.move++;
        }
    }

    public String getCarName() {
        return carName;
    }

    public int getCarMove() {
        return move;
    }

}
