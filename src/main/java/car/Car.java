package car;

public class Car {

    private int position;

    public void move(int position) {
        this.position += position;
    }

    public int getPosition() {
        return position;
    }
}