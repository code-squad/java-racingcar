package racing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RacingTest {

    private Car[] cars;
    private Racing racing;

    @Before
    public void setUp() throws Exception {
        cars = new Car[3];
        racing = new Racing();

        for (int i = 0; i < cars.length; i++)
            cars[i] = new Car((char)('A' + i) + "");
    }

    @After
    public void tearDown() throws Exception {
        cars = null;
        racing = null;
    }

    @Test
    public void getWinner() {
        for (int i = 0; i < cars.length; i++)
            cars[i].move(i + 2);

        assertEquals(racing.getWinner(cars).getCarDistance(), "-");
    }

    @Test
    public void getWinners() {
        for (int i = 0; i < cars.length; i++)
            cars[i].move(i + 3);

        List<String> winnerList = racing.getWinners(cars);
        for(String winner : winnerList)
            assertEquals(winner, "C");

    }
}