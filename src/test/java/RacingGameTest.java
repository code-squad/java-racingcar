import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class RacingGameTest {

    private RacingGame racingGame;

    @Before
    public void setup() {
        List<Car> cars = new ArrayList<>(Arrays.asList(new Car(), new Car(), new Car()));
        racingGame = new RacingGame(5, cars);
    }

    @Test
    public void createRandomTest() {
        int result = racingGame.createRandom();
        assertTrue(0 <= result && result < 10);
    }
}