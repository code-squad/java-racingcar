import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RacingGameTest {

    private RacingGame racingGame;

    @Before
    public void 초기설정() {
        racingGame = new RacingGame(5, 4);
    }

    @Test
    public void 자동차생성() {
        racingGame.start();
        assertEquals(5, racingGame.getCars().size());
    }

}
