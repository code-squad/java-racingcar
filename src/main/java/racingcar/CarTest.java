package racingcar;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CarTest {
    private Car car;

    @Before
    public void setup() {
        car = new Car("joe");
    }

    @Test
    public void moveTest() {
        assertEquals(true, car.move(4));
        assertEquals(false, car.move(3));
    }
    
    @Test
    public void nameTest() {
    		assertEquals("joe", car.getName());
    }
}
