import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car car;
    @Before
    public void setup(){
        car = new Car();
    }

    @Test
    public void tryMoveTest() {
        car.tryMove(5);
        assertEquals(car.getPosition(), 1);
    }
}
