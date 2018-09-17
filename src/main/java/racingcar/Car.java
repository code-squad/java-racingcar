package racingcar;

public class Car {

    private String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
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

    public int maxPosition(int higher) {
        return higher > this.position ? higher : this.position;
    }

    public String compareScore(int higher) {
        return higher == this.position ? name : null;
    }

    public boolean isMaxPosition(int max) {
        if(max == this.position) {
            return true;
        }
        return false;
    }
}
