package racing;

import car.Car;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class RacingGameTest {

    @Test(expected = IllegalArgumentException.class)
    public void initTestWithInvalidInputTest() {
        new RacingGame(Car.createCars(
                Arrays.asList()
        ), -1);
    }
}
