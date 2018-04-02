package car;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {
    RacingGame game;

    @Before
    public void setUp(){
        game = new RacingGame();
    }

    @Test
    public void 랜덤숫자_4이상일때_전진() {
        int[] carPositions = {0, 0, 0};
        game.tryOngoing(carPositions, 2, 5);
        assertThat(carPositions[2] == 2);
    }

    @Test
    public void 한대의차출력() {
        game.printCar(3);
        assertThat("---".equals(System.out.toString()));
    }

    @After
    public void tearDown(){
        game = null;
    }
}
