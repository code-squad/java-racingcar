import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by hoon on 2018. 1. 6..
 */
public class CarTest {

    private Racing racing;

    @Before
    public void setup() {
        racing = new Racing(3, 5);
    }

    @Test
    public void 모두_1번_움직인다() {
        for(Car car : racing.getCars()) {
            car.move();
            assertEquals(1, car.getPosition());
        }
    }

    @Test
    public void 랜덤숫자가_4이상일때만_움직인다() {

        Car car = new Car();

        assertFalse(car.shouldMove(0));
        assertFalse(car.shouldMove(1));
        assertFalse(car.shouldMove(2));
        assertFalse(car.shouldMove(3));

        assertTrue(car.shouldMove(4));
        assertTrue(car.shouldMove(5));
        assertTrue(car.shouldMove(6));
        assertTrue(car.shouldMove(7));
        assertTrue(car.shouldMove(8));
        assertTrue(car.shouldMove(9));
    }

    @Test
    public void 랜덤숫자가_0에서_9인지() {
        Car car = new Car();
        for(int i = 0; i < 10000; i++) {
            int random = car.getRandom();
            assertTrue(random >= 0 && random < 10);
        }
    }

}
