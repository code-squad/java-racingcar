import model.Car;
import model.RacingGame;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RacingGameTest {

    private RacingGame racingGame;
    List<Car> cars;

    @Before
    public void setup() {
        cars = new ArrayList<>(Arrays.asList(new Car("a"), new Car("b"), new Car("c")));
        racingGame = new RacingGame(5, cars);
    }

    @Test
    public void createRandomTest() {
        int result = racingGame.createRandom();
        assertTrue(0 <= result && result < 10);
    }

    @Test
    public void getMaxTest() {
        cars.get(0).tryMove(5);
        assertEquals(1, racingGame.getMax());
    }

    @Test
    public void getWinnerTest() {
        cars.get(0).tryMove(5);
        cars.get(1).tryMove(5);
        cars.get(1).tryMove(5);
        cars.get(2).tryMove(5);
        cars.get(2).tryMove(5);
        cars.get(2).tryMove(5);
        String[] expectedWinner = {"c"};
        assertArrayEquals(expectedWinner, racingGame.getWinners());

    }
}