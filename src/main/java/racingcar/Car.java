package racingcar;

public class Car {
    private static final int FORWARD_NUM = 4;
    private final int MIN_COUNT = 1;

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

    public int getPosition() {
        return position;
    }

    public int getMaxPosition(int max) {
        return max > this.position ? max : this.position;
    }

    public boolean isMaxPosition(int max) {
        if(max == this.position) {
            return true;
        }
        return false;
    }

    public void moveCar(int random) {
        if(random >= FORWARD_NUM) {
            this.position = this.position + MIN_COUNT;
        }
    }
}
