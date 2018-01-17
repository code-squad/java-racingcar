import controller.RacingGameController;
import model.Car;
import model.RacingGame;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class RacingGameControllerTest {
    RacingGameController controller;

    @Before
    public void setup() {
        controller = new RacingGameController();
    }

    @Test
    public void initCarsTest() {
        String[] carNames = {"a","b","c"};
        List<Car> cars =  controller.initCars(carNames);
        assertEquals(carNames.length, cars.size());
    }
}
