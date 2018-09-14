package racingcar;

public class Car {

    private String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    private int getPosition() {
        return position;
    }

    private void setPosition(int pos) {
        this.position = pos;
    }

    public void plusMove(int move) {
        setPosition(move + position);
    }

    public int showPos() {
        return getPosition();
    }

    public String showName() {
        return getName();
    }
}
