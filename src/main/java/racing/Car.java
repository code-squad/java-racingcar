package racing;

public class Car {

    private String name;

    int position;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public Car(Car car) {
        this.name = car.getName();
        this.position = car.getPosition();
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int increase) {
        this.position += increase;
    }

}
