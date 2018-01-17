import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarTest {
    private static final Logger logger = LoggerFactory.getLogger(CarTest.class);
    Car car;

    @Before
    public void setUp(){
        Car car = new Car("jimmy");
    }

    @Test
    public void move(){
        int position = car.move(4);
        assertEquals(1, position);
    }
    @Test
    public void notMove(){
        int position = car.move(3);
        assertEquals(0, position);
    }
}

