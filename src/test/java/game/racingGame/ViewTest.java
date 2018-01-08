package game.racingGame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ViewTest {
    private List<Car> cars;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setUp(){
        cars = new ArrayList();

        Car car1 = new Car();
        car1.move(4);
        cars.add(car1);

        Car car2 = new Car();
        car2.move(3);
        cars.add(car2);

        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void cleanUp(){
        System.setOut(null);
    }

    @Test
    public void viewTest(){
        View.getResult(cars);
        assertEquals("-\n\n", outputStream.toString());
    }
}
