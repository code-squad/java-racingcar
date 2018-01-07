package car;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CarTest {
    private Car car;

    @Before
    public void init() {
        car = new Car();
    }

    @Test
    public void tryMoveTest() {
        int prevPosition = car.getCurrentPosition();
        boolean result = car.tryMove();
        assertEquals(result, prevPosition + 1 == car.getCurrentPosition());
    }

    @Test
    public void tryMoveManyTimeTest() {
        for(int i = 0 ; i < 100 ; ++i)
            tryMoveTest();
    }
}
