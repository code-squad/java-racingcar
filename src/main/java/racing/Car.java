package racing;

public class Car {
    private int number;
    private int distance;

    public Car(int number) {
        this.number = number;
    }

    public Car() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getDistance() {
        return distance;
    }

    public void move() {
        this.distance++;
    }
}
