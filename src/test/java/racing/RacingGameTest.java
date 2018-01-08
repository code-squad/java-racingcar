package racing;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class RacingGameTest {

    private RacingGame game;

    private String[] names;

    private int times = 3;

    @Before
    public void setUp() throws Exception {
        names = new String[] {"test1", "test2"};
        game = new RacingGame(names, times) {
            @Override
            protected Car[] createCars(String[] names) {
                return new Car[] {new Car(() -> 0, "test1"), new Car(() -> 5, "test2")};
            }
        };
    }

    @Test
    public void moveAllCars() throws Exception {
        List<RacingResult> results = game.doRacing();

        assertEquals(2, results.size());
        assertEquals(0, results.get(0).getPosition());
        assertEquals("test1", results.get(0).getName());
        assertEquals(3, results.get(1).getPosition());
        assertEquals("test2", results.get(1).getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void RacingGameImpl_times값이0인경우() throws Exception {
        new RandomRacingGame(names, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void RacingGameImpl_times값이0보다작은경우() throws Exception {
        new RandomRacingGame(names, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void RacingGameImpl_names가널인경우() throws Exception {
        new RandomRacingGame((String[]) null, 3);
    }

}