package racing.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    @Test
    public void matchPosition() throws Exception {
        Car car = Car.newInstance("world");

        assertTrue(car.matchPosition(0));
        assertFalse(car.matchPosition(1));
    }

    @Test
    public void newInstance() throws Exception {
        String carName = "appleCar";
        Car car = Car.newInstance(carName);

        assertEquals(carName, car.getName());
        assertEquals(0, car.getPosition());
    }

    @Test
    public void move() {
        Car car = Car.newInstance("hello");

        car.move(() -> true);
        assertEquals(1, car.getPosition());

        car.move(() -> false);
        assertEquals(1, car.getPosition());
    }
}
