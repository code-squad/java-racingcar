package racing;

import java.util.Random;

public class RacingCar implements Car {

    private final static int MIN_FORWARD_NUMBER = 4;
    private final static int RANDOM_BOUND = 10;

    private int distance;

    @Override
    public void move(final int tryCount) {
        for (int i = 0; i < tryCount; i++) {
            if (getRandom() < MIN_FORWARD_NUMBER) continue;
            this.distance++;
        }
    }

    private int getRandom() {
        return new Random(System.nanoTime()).nextInt(RANDOM_BOUND);
    }

    public void printCarDistance() {
        for (int i = 0; i < distance; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}