package car;

import org.junit.Before;
import org.junit.Test;
import util.RandomUtil;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static util.RandomUtilTest.BOUND_NUM;
import static util.Static.MOVE_MARK;

public class CarTest {
    private Car car;

    @Before
    public void init() {
        car = new Car();
    }

    @Test
    public void isMovableTest() {
        assertFalse(car.isMovable(3));
        assertTrue(car.isMovable(4));
    }

    @Test
    public void toStringTest() {
        int testTime = RandomUtil.nextInt(BOUND_NUM);
        for(int i = 0 ; i < testTime ; ++i)
            car.tryMove();

        int movedDistance = car.getCurrentPosition();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < movedDistance ; ++i)
            sb.append(MOVE_MARK);

        assertEquals(sb.toString(), car.toString());
    }
}
