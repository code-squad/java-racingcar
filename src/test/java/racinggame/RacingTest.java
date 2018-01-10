package racinggame;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class RacingTest {


    private Racing racing;
    @Before
    public void setUp() throws Exception {
        List<Car> cars = Arrays.asList(
            new Car("Sooyoung", 2),
            new Car("Test", 1),
            new Car("Code", 2)
        );
        racing= new Racing(cars);
    }

    @Test
    public void getWinnerCars() {
      List<Car> winnerCars = racing.getWinnerCars();
      assertEquals(2,winnerCars.size());
    }

}
