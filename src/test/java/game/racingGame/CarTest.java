package game.racingGame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Car car;

    @Before
    public void setup() {
        car = new Car();
    }

    @Test
    public void moveTest_이동안함() {
        int position = car.move(2);
        assertEquals(0, position);
    }

    @Test
    public void moveTest_이동() {
        int position = car.move(4);
        assertEquals(1, position);
    }
}
