package racingcartest;

import org.junit.Before;
import org.junit.Test;
import racingcar.RacingGame;

import static org.junit.Assert.assertTrue;

public class RacingGameTest {
    private RacingGame game;

    @Before
    public void init() {
        game = new RacingGame();
    }

    @Test
    public void zeroTimeTest() {
        assertTrue(game.zeroTimeTest());
    }

    @Test
    public void fiveTimeTest() {
        assertTrue(game.fiveTimeTest());
    }
}
