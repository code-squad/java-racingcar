import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
/**
 * Created by hoon on 2018. 1. 6..
 */
public class CarTest {

    private Racing racing;
    private Car car;

    @Before
    public void setup() {
        racing = new Racing("pobi,crong,honux", 5);
        car = new Car();
    }

    @Test
    public void 랜덤숫자가_4이상일때만_움직인다() {
        car.move(3);
        assertEquals(0, car.getPosition());
        car.move(4);
        assertEquals(1, car.getPosition());
    }

    @Test
    public void 랜덤숫자가_0에서_9인지() {
        for(int i = 0; i < 10000; i++) {
            int random = Utils.getRandomNumber();
            assertTrue(random >= 0 && random < 10);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void split_with_comma_테스트() {
        Utils.splitWithComma("");
        Utils.splitWithComma(null);
    }

}