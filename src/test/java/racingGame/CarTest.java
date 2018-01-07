package racingGame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    private Car car;

    @Before
    public void setUp() {
        car = new Car();
    }

    @Test
    public void 프린트_테스트() throws Exception {
        assertEquals("-",car.moveString());
    }

    @Test
    public void 전진_테스트() throws Exception {
        car.rePosition(5);
        assertEquals(1, car.getPosition());
    }

}