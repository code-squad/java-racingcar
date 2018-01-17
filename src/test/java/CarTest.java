import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class CarTest {
    private static final Logger logger = LoggerFactory.getLogger(CarTest.class);
    private int position;
    static private ArrayList<Car> cars;
    Random rnd = new Random();
    Scanner scanner = new Scanner(System.in);
    Car car;
    Racing racing;

    @Before
    public void setUp(){
        car = new Car("jimmy");
        Racing racing = new Racing();
        String[] names = { "pobi","honux","krong"};
        cars = racing.carinput(names);
        cars.get(0).setPosition(5);
        cars.get(1).setPosition(5);
        cars.get(2).setPosition(10);
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