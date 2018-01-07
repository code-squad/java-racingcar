package racingGame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    private Car car;
    private int standard;

    @Before
    public void setUp() {
        car = new Car();
        standard = 4;
        car.rePosition(standard);
    }

    @Test
    public void 프린트_테스트() throws Exception {
        assertEquals("-",car.resultString());
    }

    @Test
    public void 전진_테스트() throws Exception {
        assertEquals(1, car.getPosition());
    }

}