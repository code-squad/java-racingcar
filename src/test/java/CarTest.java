import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
/**
 * Created by hoon on 2018. 1. 6..
 */
public class CarTest {

    private Racing racing;
    private Car car;

    @Before
    public void setup() {
        racing = new Racing(3, 5);
        car = new Car();
    }

    @Test
    public void 랜덤숫자가_4이상일때만_움직인다() {
        assertFalse(car.shouldMove(3));
        assertTrue(car.shouldMove(4));
    }

    @Test
    public void 랜덤숫자가_0에서_9인지() {
        for(int i = 0; i < 10000; i++) {
            int random = Utils.getRandomNumber();
            assertTrue(random >= 0 && random < 10);
        }
    }

}
