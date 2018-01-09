package racing;

public class Car {
    private int distance;

    public Car() {
    }

    public int getDistance() {
        return distance;
    }

    public void move() {
        this.distance++;
    }
}
