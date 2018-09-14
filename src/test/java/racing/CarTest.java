package racing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    private Car car;

    @Before
    public void setUp() throws Exception {
        car = new Car("TEST");
    }

    @After
    public void tearDown() throws Exception {
        car = null;
    }

    @Test
    public void move1() {
        car.move(7);
        assertEquals(car.getCarDistance(), "-");
    }

    @Test
    public void move2() {
        car.move(1);
        assertEquals(car.getCarDistance(), "");
    }
}