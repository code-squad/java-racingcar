package racing.car;

import java.util.Random;

/**
 * Created by Moonchan on 2018. 1. 6..
 */
public class RandomNumberGenerator implements NumberGenerator{

    private Random random;
    private int min;
    private int max;

    public RandomNumberGenerator() {
        this(10);
    }

    public RandomNumberGenerator(int max) {
        this(0, max);
    }

    public RandomNumberGenerator(int min, int max) {
        random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public int generateNumber() {
        return random.nextInt(max) + min;
    }
}
