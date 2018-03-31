package racinggame;

public class Car {

    private int position;

    Car() {
        this.position = 0;
    }

    void move() {
        this.position++;
    }

    int getPosition() {
        return this.position;
    }
}
