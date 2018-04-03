package racingcar;

import racingcar.interfaces.PointMaker;

import java.util.Random;

/**
 * @author sangsik.kim
 */
public class RandomPointMaker implements PointMaker {
    private final static Integer LIMIT_SCORE = 10;

    @Override
    public Integer generate() {
        return new Random().nextInt(LIMIT_SCORE);
    }
}
