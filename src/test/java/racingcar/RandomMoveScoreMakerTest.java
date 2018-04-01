package racingcar;

import org.junit.Test;
import racingcar.interfaces.MoveScoreMaker;

import static org.junit.Assert.fail;

/**
 * @author sangsik.kim
 */
public class RandomMoveScoreMakerTest {

    @Test
    public void 랜덤값_0이상_10미만_생성() {
        MoveScoreMaker moveScoreMaker = new RandomMoveScoreMaker();
        for (int i = 0; i < 100000; i++) {
            Integer valueFromZeroToNine = moveScoreMaker.generate();
            if (valueFromZeroToNine < 0 || valueFromZeroToNine > 9) {
                fail();
            }
        }
    }
}
