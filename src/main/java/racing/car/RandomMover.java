package racing.car;

import java.util.Random;

/**
 * Created by Moonchan on 2018. 1. 6..
 */
public class RandomMover implements Movable{

    private static final int DEFAULT_BOUND = 4;

    private final Random random;
    private final int min;
    private final int max;
    private final int bound;

    public RandomMover() {
        this(10);
    }

    public RandomMover(int max) {
        this(0, max);
    }

    public RandomMover(int min, int max) {
        this(min, max, DEFAULT_BOUND);
    }

    public RandomMover(int min, int max, int bound) {
        random = new Random();
        this.min = min;
        this.max = max;
        this.bound = bound;
    }

    @Override
    public boolean move() {
        return random.nextInt(max) + min > bound;
    }
}
