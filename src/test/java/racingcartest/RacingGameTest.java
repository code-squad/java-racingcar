package racingcartest;

import org.junit.Before;
import org.junit.Test;
import racingcar.RacingGame;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class RacingGameTest {
    private static final int INPUT_TIME = 5;
    private static final int ZERO_TIME = 0;
    private static final int INIT_POSITION = 1;
    private static final int FIVE_TIME_MAX_POSITION = 6;
    private static final String INPUT_NAME = "a,b,c,d,e";
    private static final int TEST_CASE = 100;
    private RacingGame game;

    @Before
    public void init() {
        game = new RacingGame(null);
    }

    @Test
    public void fiveTimeTest() {
        for (int i = 0; i < TEST_CASE; i++) {
            game = new RacingGame(null);
            game.initCars(INPUT_NAME);
            game.run(INPUT_TIME);
            assertTrue(game.getMaxPosition() >= INIT_POSITION);
            assertTrue(game.getMaxPosition() <= FIVE_TIME_MAX_POSITION);
        }
    }

    @Test
    public void zeroTimeTest() {
        game = new RacingGame(null);
        game.initCars(INPUT_NAME);
        game.run(ZERO_TIME);
        assertEquals(game.getMaxPosition(), INIT_POSITION);
    }
}
