package car;

import org.junit.Before;
import org.junit.Test;
import util.RandomUtil;

import static junit.framework.TestCase.assertEquals;
import static util.RandomUtilTest.BOUND_NUM;
import static util.Static.MOVE_MARK;
import static util.Static.RANDOM_NUM_BOUND;

public class CarTest {
    private Car car;

    @Before
    public void init() {
        car = new Car("TestCar");
    }

    @Test
    public void tryMoveTest() {
        car.tryMove(3);
        assertEquals(0, car.getCurrentPosition());
        car.tryMove(4);
        assertEquals(1, car.getCurrentPosition());
    }

    @Test
    public void toStringTest() {
        int testTime = RandomUtil.nextInt(BOUND_NUM);
        for(int i = 0 ; i < testTime ; ++i)
            car.tryMove(RandomUtil.nextInt(RANDOM_NUM_BOUND));

        int movedDistance = car.getCurrentPosition();
        StringBuilder sb = new StringBuilder("TestCar");
        for(int i = 0 ; i < movedDistance ; ++i)
            sb.append(MOVE_MARK);

        assertEquals(sb.toString(), car.toString());
    }
}
