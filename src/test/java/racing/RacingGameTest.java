package racing;

import org.junit.Test;

import java.util.ArrayList;

public class RacingGameTest {

    @Test(expected = IllegalArgumentException.class)
    public void initTestWithInvalidInputTest() {
        new RacingGame(new ArrayList<String>(), -1);
    }
}
