import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    Car testCar1;

    @Before
    public void setUp() throws Exception {
        testCar1 = new Car("test1");
    }

    @Test
    public void 이동한다() {
        testCar1.run(4);
        assertEquals(1, testCar1.getCarPos());
    }

    @Test
    public void 이동하지않는다() {
        testCar1.run(3);
        testCar1.run(1);
        assertEquals(0, testCar1.getCarPos());

        testCar1.run(-1);
        assertEquals(0, testCar1.getCarPos());
    }
}