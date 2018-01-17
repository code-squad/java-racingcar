import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    private Car car;

    @Before
    public void setup() {
        car = new Car("a");
    }

    @Test
    public void tryMoveSuccessTest() {
        car.tryMove(5);
        assertEquals(1, car.getPosition());
    }

    @Test
    public void tryMoveFailTest() {
        car.tryMove(3);
        assertEquals(0, car.getPosition());
    }
}
