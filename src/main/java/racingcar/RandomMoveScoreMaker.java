package racingcar;

import racingcar.interfaces.MoveScoreMaker;

import java.util.Random;

/**
 * @author sangsik.kim
 */
public class RandomMoveScoreMaker implements MoveScoreMaker {
    private final static Integer LIMIT_SCORE = 10;

    @Override
    public Integer generate() {
        return new Random().nextInt(LIMIT_SCORE);
    }
}
