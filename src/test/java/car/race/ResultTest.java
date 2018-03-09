package car.race;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ResultTest {
    static Result result;
    static List<Car> cars;
    static CarRace race;
    static Car car1, car2, car3;

    @Before
    public void setUp() {
        result = new Result();
        cars = new ArrayList<>();
        race = new CarRace("A,B,C", 10);
        car1 = new Car("A");
        car2 = new Car("B");
        car3 = new Car("C");
        for (int i = 0; i < 10; i++) {
            car1.runOnce(9); // car1's position = 10 (expected maxPosition, CarName = "A")
        }
        for (int i = 0; i < 5; i++) {
            car2.runOnce(9); // car2's position = 5
        }
        for (int i = 0; i < 10; i++) {
            car1.runOnce(4); // car1's position = 0
        }

        cars.add(car1);
        cars.add(car2);
        cars.add(car3); // add car objects to a list
    }

    @Test
    public void findMaxPosition() {

        result.findMaxPosition(cars);

        assertEquals(10, result.getMaxPosition());
    }

    @Test
    public void findWinner() {
        result.findWinner(cars);
        assertEquals("A", result.getWinnerNames());
    }
}