import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Car car;

    @Before
    public void 초기설정() {
        car = new Car();
    }

    @Test
    public void 움직임_가능() {
        car.move(5);
        assertEquals(1, car.getPosition());
    }

    @Test
    public void 움직임_불가능() {
        car.move(2);
        assertEquals(0, car.getPosition());
    }

    @Test
    public void 출력() {
        car.move(6);
        car.move(4);
        car.move(2);
        assertEquals("--", car.toString());
    }

}
