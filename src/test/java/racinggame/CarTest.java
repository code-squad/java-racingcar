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
    public void move() {
        car.move();
        car.move();
    }

    @Test
    public void print() {
        assertEquals("---", car.print());
    }
}