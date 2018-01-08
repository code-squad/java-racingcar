package racing.car;

/**
 * Created by Moonchan on 2018. 1. 6..
 */
public class Car {

    private static int id = 1;
    private static int BOUND = 4;
    private String name;
    private int position;
    private Engine engine;

    public Car() {
        this(new Engine(4, new RandomNumberGenerator()));
    }

    public Car(Engine engine) {
        this.engine = engine;
        this.name = "Car" + id++;
    }

    public void move() {
        if (canMoveCar()) {
            this.position++;
        }
    }

    private boolean canMoveCar() {
        return engine.move();
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}