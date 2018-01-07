package racing;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class RandomRacingGameTest {

    private String[] names;

    @Before
    public void setUp() throws Exception {
        names = new String[] {"test1", "test2"};
    }

    @Test
    public void createCars() throws Exception {
        RacingGame racingGame = new RandomRacingGame(names, 3);

        Car[] cars = racingGame.createCars(names);

        assertEquals(2, cars.length);
        assertEquals(true, Arrays.stream(cars)
                                 .allMatch(car -> car.getStrategy() == RandomMoveStrategy.getInstance()));
    }

}