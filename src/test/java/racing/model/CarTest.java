package racing.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
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

        car.move(true);
        assertEquals(1, car.getPosition());

        car.move(false);
        assertEquals(1, car.getPosition());
    }
}