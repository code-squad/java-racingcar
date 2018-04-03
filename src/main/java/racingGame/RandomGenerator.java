package racingGame;

import java.util.Random;

/**
 * Created by hongjong-wan on 2018. 4. 2..
 */
public class RandomGenerator {

    private static final int RANDOM_RANGE = 10;

    public static int getRandomNum() {
        Random random = new Random();
        return random.nextInt(RANDOM_RANGE);
    }

}
