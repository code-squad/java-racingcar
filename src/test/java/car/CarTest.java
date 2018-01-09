package car;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CarTest {
    private Car car;

    @Before
    public void setup() {
        car = new Car("");
    }

    @Test
    public void move_4이상() {
        car.move(4);
        assertEquals(1, car.getPosition());
    }

    @Test
    public void move_4미만() {
        car.move(3);
        assertEquals(0, car.getPosition());
    }

    @Test
    public void randomInt() {
        for (int i = 0; i < 1000; i++) {
            assertTrue(car.randomInt() < 10 && car.randomInt() >= 0);
        }
    }
}
