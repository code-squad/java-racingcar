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

}