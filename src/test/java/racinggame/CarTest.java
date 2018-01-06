package racinggame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    private Car car;

    @Before
    public void setUp() throws Exception {
        car = new Car();
    }

    @Test
    public void move_back() {
        assertEquals(0, car.move(3));
    }

    @Test
    public void move_forward() {
        assertEquals(1, car.move(4));
    }
}