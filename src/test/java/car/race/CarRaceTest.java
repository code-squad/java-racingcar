package car.race;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CarRaceTest {
    CarRace race;
    Car car1, car2, car3;
    List<Car> cars;

    @Before
    public void setUp(){
        race = new CarRace("A,B,C", 8);
        car1 = new Car("A");
        car2 = new Car("B");
        car3 = new Car("C");
        car1.runCar(new int[]{1,2,3,4});
        car2.runCar(new int[]{0,0,9,9});
        car3.runCar(new int[]{5,6,7,8});
        cars = new ArrayList(Arrays.asList(car1, car2, car3));
    }

    @Test
    public void findMaxPosition() {

        int maxPosition = race.findMaxPosition(cars);

        assertEquals(4,maxPosition);
    }

    @Test
    public void findWinner() {

        String winner = race.findWinner(cars);

        assertEquals("C", winner);
    }
}