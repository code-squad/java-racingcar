import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RacingGameTest {

    RacingGame racingGame;

    @Before
    public void setup() {
        Car cars[] = {new Car(), new Car(), new Car()};
        racingGame = new RacingGame(5, cars);
    }

    @Test
    public void createRandomTest() {
        int result = racingGame.createRandom();
        assertTrue(0 <= result && result < 10);
    }
}