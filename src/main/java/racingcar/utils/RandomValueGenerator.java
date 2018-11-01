package racingcar.utils;

import java.util.Random;

public class RandomValueGenerator {
    private static final int RANGE = 10;

    private RandomValueGenerator() {
    }

    public static int generateRandomNum() {
        Random rnd = new Random();
        return rnd.nextInt(RANGE);
    }
}
