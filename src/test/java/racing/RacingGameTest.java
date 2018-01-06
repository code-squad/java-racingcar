package racing;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class RacingGameTest {

    private RacingGame game;

    private int times = 3;

    @Before
    public void setUp() throws Exception {
        game = new RacingGame(new Car[] {new Car(() -> 5), new Car(() -> 6)}, times);
    }

    @Test
    public void moveAllCars() throws Exception {

        List<Integer> result = game.moveAllCars();

        assertEquals(2, result.size());
        assertEquals(5 * times, result.get(0).intValue());
        assertEquals(6 * times, result.get(1).intValue());
    }

}