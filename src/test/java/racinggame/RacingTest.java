package racinggame;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RacingTest {


    private Racing racing;
    @Before
    public void setUp() throws Exception {
        Car car = new Car("Sooyoung");
        car.move(5);
        car.move(5);
        Car car2 = new Car("Test");
        car2.move(5);
        car2.move(1);
        Car car3 = new Car("Code");
        car3.move(5);
        car3.move(5);

        List<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add(car2);
        cars.add(car3);
        racing= new Racing(cars);
    }

    @Test
    public void getWinnerCars() {
      List<Car> winnerCars = racing.getWinnerCars();
      assertEquals(2,winnerCars.size());
    }

}
