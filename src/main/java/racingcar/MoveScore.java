package racingcar;

import java.util.Random;

/**
 * @author sangsik.kim
 */
public class MoveScore {
    Integer LIMIT_SCORE = 10;

    public Boolean canMove() {
        return generateRandomMoveScore() >= 4;
    }

    private Integer generateRandomMoveScore() {
        return new Random().nextInt(LIMIT_SCORE);
    }
}
