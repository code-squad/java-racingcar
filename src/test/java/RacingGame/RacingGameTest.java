package RacingGame;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class RacingGameTest {
    RacingGame racingGame;

    @Before
    public void setup(){
        racingGame = new RacingGame();
    }

    @Test
    public void max() {
        assertEquals(5, racingGame.max(3,5));
    }
}
