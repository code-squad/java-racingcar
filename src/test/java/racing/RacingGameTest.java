package racing;

import org.junit.Test;

public class RacingGameTest {

    @Test(expected = IllegalArgumentException.class)
    public void initTestWithInvalidInputTest() {
        new RacingGame(-1, -1);
    }
}
