package racing.player;

public class Car {

    private static final int SUFFICIENT_SPEED = 4;
    private static final int START_POSITION = 0;

    public int position;
    public String name;

    public Car(String name) {
        this(name, START_POSITION);
    }

    @SuppressWarnings("WeakerAccess")
    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public void move(int randomValue) {
        if(randomValue >= SUFFICIENT_SPEED) {
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
