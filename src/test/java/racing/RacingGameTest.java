package racing;

import org.junit.Before;
import org.junit.Test;
import racing.RandomRacingGame;

import java.util.List;

import static org.junit.Assert.*;

public class RandomRacingGameTest {

    private RandomRacingGame game;
    private int numberOfCars = 5;
    private int times = 3;

    @Before
    public void setUp() throws Exception {
        game = new RandomRacingGame(times, numberOfCars);
    }

    @Test
    public void move() throws Exception {
        List<Integer> result = game.move();

        assertEquals(result.size(), numberOfCars);
    }

}