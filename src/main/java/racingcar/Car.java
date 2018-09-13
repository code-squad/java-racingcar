package racingcar;

import java.util.Random;

public class Car {
    private static final int RANDOM_BOUND = 100;
    private static final int MOVE_POSSIBILITY = 40;
    private static Random rnd = new Random();
    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 1;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move() {
        if (rnd.nextInt(RANDOM_BOUND) <= MOVE_POSSIBILITY) {
            position++;
        }
    }

    public int comparePosition(int bestPosition) {
        return Math.max(this.position, bestPosition);
    }
}

