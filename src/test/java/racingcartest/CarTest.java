package racingcartest;

import org.junit.Before;
import org.junit.Test;
import racingcar.Car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CarTest {
    private static final String TEST_NAME = "test_name";
    private static final int INITIAL_POSITION = 1;
    private static final int UNREACHABLE_POSITION = 0;
    private static final String BLANK = "";
    private static final String COMMA = ",";
    private static final int TEST_CASE = 100;
    private Car car;

    @Before
    public void init() {
        car = new Car(TEST_NAME);
    }

    @Test
    public void getTest() {
        assertEquals(car.getPosition(), INITIAL_POSITION);
        assertEquals(car.getName(), TEST_NAME);
    }

    @Test
    public void moveTest() {
        for (int i = 0; i < TEST_CASE; i++) {
            car = new Car("");
            car.move();
            assertTrue(car.getPosition() >= 1 && car.getPosition() <= 2);
        }
    }

    @Test
    public void comparePositionTest() {
        assertEquals(car.comparePosition(UNREACHABLE_POSITION), INITIAL_POSITION);
        assertEquals(car.comparePosition(Integer.MAX_VALUE), Integer.MAX_VALUE);
    }

    @Test
    public void checkWInnerTest() {
        assertEquals(car.checkWInner(INITIAL_POSITION), TEST_NAME + COMMA);
        assertEquals(car.checkWInner(Integer.MAX_VALUE), BLANK);
    }
}
