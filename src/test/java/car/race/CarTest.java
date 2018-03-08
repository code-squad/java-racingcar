package car.race;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    Car car;
    CarRace race;

    @Before
    public void setUp(){
        car = new Car("test");
        race = new CarRace("A",10);

    }

    @Test
    public void runOnceGreaterThanFour(){
        assertEquals(1, car.runOnce(5));

    }

    @Test
    public void runOnceLessThanOrEqualToFour(){
        assertEquals(0, car.runOnce(3));

    }
}