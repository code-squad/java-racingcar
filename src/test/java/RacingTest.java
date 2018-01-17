import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class RacingTest {
    private static final Logger logger = LoggerFactory.getLogger(RacingTest.class);
    static private ArrayList<Car> cars;

    @Before
    public void setUp(){
        Racing racing = new Racing();
        String[] names = { "pobi","honux","krong"};
        cars = racing.carinput(names);
        cars.add(new Car(names[0],5));
        cars.add(new Car(names[1],5));
        cars.add(new Car(names[2],10));
    }

    @Test
    public void printPosition() {
        for (int i = 0; i < cars.size(); i++) {
            logger.info("Position is {}", cars.get(i).getPosition());
        }
    }
    @Test
    public void printName() {
        assertEquals("pobi",cars.get(0).getName());
        assertEquals("honux",cars.get(1).getName());
        assertEquals("krong",cars.get(2).getName());
    }

    @Test
    public void printMaxPosition() {
        int max = Racing.maxValue(cars);
        assertEquals(10, max);
    }

    @Test
    public void printMaxList() {
        ArrayList<Car> maxArraylist = Racing.maxList(10);
        assertEquals("krong", cars.get(2).getName());

    }
}