package car;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static car.RacingUtils.REGEX;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by youngjae on 2018. 1. 6..
 */
public class CarRacingTest {
    private static final int TRY_COUNT = 5;
    private static final String TEST_NAME_1 = "pobi";
    private static final String TEST_NAME_2 = "crong";
    private static final String TEST_NAME_3 = "honux";
    private CarRacing carRacing;

    @Before
    public void init() {
        carRacing = CarRacing.readyForRacing();
        carRacing.setTryCount(3);
        carRacing.createCarsByName(new String[]{TEST_NAME_1, TEST_NAME_2, TEST_NAME_3});
    }

    @Test
    public void Car_우승자의_이동값이_올바른가() {
        List<Car> cars = carRacing.startRacing();
        assertTrue(cars.get(0).getMove() <= TRY_COUNT);
        assertTrue(cars.get(1).getMove() <= TRY_COUNT);
        assertTrue(cars.get(2).getMove() <= TRY_COUNT);
    }

    @Test
    public void 우승자가_존재_하는가() {
        carRacing.startRacing();
        assertTrue(carRacing.getWinners().split(REGEX).length > 0);
    }

    @Test
    public void Car의_레이싱_결과가_올바른가() {
        List<Car> cars = carRacing.startRacing();
        Long carLength = cars.stream().filter(car -> car.getMove() == carRacing.getMaxMove()).map(Car::getName).collect(Collectors.counting());
        String[] winners = carRacing.getWinners().split(REGEX);

        assertEquals(winners.length, Math.toIntExact(carLength));
    }

    @Test(expected = IllegalArgumentException.class)
    public void tryCount가_올바르지_않을때_예외가_발생하는가() {
        carRacing.setTryCount(0);
    }
}
