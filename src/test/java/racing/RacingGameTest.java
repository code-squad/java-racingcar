package racing;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class RacingGameTest {

    private RacingGame game;

    private Car[] cars;

    private int times = 3;

    @Before
    public void setUp() throws Exception {
        Car car1 = new Car(() -> 2, "test1");
        Car car2 = new Car(() -> 6, "test2");

        cars = new Car[] {car1, car2};
        game = new RacingGameImpl(cars, times);
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
        new RacingGameImpl(cars, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void RacingGameImpl_times값이0보다작은경우() throws Exception {
        new RacingGameImpl(cars, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void RacingGameImpl_cars이널인경우() throws Exception {
        new RacingGameImpl(null, 3);
    }

}