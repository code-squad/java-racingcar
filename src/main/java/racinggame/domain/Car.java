package racinggame.domain;

public class Car {

    private final static int MOVE_CRITERIA = 4;
    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    void move(int position) {
        if (isMoveAble(position))
            this.position++;
    }

    boolean isMoveAble(int position) {
        return position >= MOVE_CRITERIA;
    }

    public int getPosition() {
        return this.position;
    }

    public String getName() { return this.name; }
}
