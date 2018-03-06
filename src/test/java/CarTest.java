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
    public void 이동() {
        assertEquals(0, testCar1.getCarPos());

        testCar1.run(4); //이동O
        assertEquals(1, testCar1.getCarPos());

        testCar1.run(3); //이동X
        testCar1.run(1); //이동X
        assertEquals(1, testCar1.getCarPos());
    }
}