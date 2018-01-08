package racing.car;

/**
 * Created by Moonchan on 2018. 1. 6..
 */
public class Car {

    private static int ID = 1;

    private final String name;
    private final Movable movable;

    private int position;

    public Car() {
        this(new RandomMover());
    }

    public Car(Movable movable) {
        this.movable = movable;
        this.name = "Car" + ID++;
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