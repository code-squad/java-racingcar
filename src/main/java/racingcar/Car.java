package racingcar;

public class Car {
    private String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    private void setPosition(int pos) {
        this.position = pos;
    }

    public void plusMove(int move) {
        setPosition(move + position);
    }
}
