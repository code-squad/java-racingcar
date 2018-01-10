package racing.car;

/**
 * Created by Moonchan on 2018. 1. 6..
 */
public class Car {

    public static final String DEFAULT_CAR_NAME = "Car";
    private static int ID = 1;

    private final String name;
    private final Movable movable;

    private int position;

    public Car() {
        this(DEFAULT_CAR_NAME + ID++, new RandomMover());
    }

    public Car(String name) {
        this(name, new RandomMover());
    }

    public Car(String name, Movable movable) {
        this.name = name.trim();
        this.movable = movable;
    }

    public void move() {
        if (movable.move()) {
            this.position++;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}