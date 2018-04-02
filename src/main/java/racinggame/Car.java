package racinggame;

public class Car {

    private final static int MOVE_CRITERIA = 4;
    private int position;

    Car() {
        this.position = 0;
    }

    void move(int position) {
        if (isMoveAble(position))
            this.position++;
    }

    boolean isMoveAble(int position) {
        return position >= MOVE_CRITERIA;
    }

    int getPosition() {
        return this.position;
    }
}
