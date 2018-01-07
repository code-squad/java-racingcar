package racing.model;

public class Car {
    private static final int START_POSITION = 0;

    private String name;
    private int position;

    public static Car newInstance(String name) {
        return new Car(name, START_POSITION);
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

    public void setPosition(int position) {
        this.position = position;
    }
}
