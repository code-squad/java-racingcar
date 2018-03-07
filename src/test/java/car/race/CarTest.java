package car.race;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    Car car;

    @Before
    public void setUp(){
        car = new Car("test");
    }

    @Test
    public void runCarGreaterThanFour() {
        car.runCar(new int[]{5,6,7,8,9});
        assertEquals(5, car.getPosition());
    }

    @Test
    public void runCarLessThanFive() {
        car.runCar(new int[]{0,1,2,3,4});
        assertEquals(0, car.getPosition());
    }

    @Test
    public void runCarMixed() {
        car.runCar(new int[]{0,2,4,7,9});
        assertEquals(2, car.getPosition());
    }
}