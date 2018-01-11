package RacingGame;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class RacingGameTest {
    RacingGame racingGame;
    Car car;

    @Before
    public void setup(){
        racingGame = new RacingGame();
        car = new Car();
    }

    @Test
    public void max() {
        assertEquals(5, racingGame.max(3,5));
    }

    @Test
    public void setWinners_Y() {
        car.setCarName("hello");
        car.movePosition(5);
        racingGame.setWinners(1, car);
        assertEquals("hello", racingGame.getWinners().get(0));
    }
}
