package game.racingGame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ViewTest {

    @Mock
    RacingGame racingGame;

    private List<Car> cars;

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setUp(){

        cars = Arrays.asList(
            new Car("car1", 1), new Car("car2", 0)
        );

        racingGame = mock(RacingGame.class);

        when(racingGame.getCars()).thenReturn(cars);
        when(racingGame.getTrialTime()).thenReturn(5);

        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void cleanUp(){
        System.setOut(null);
    }

    @Test
    public void printName(){
        for (Car car:cars){
            View.printName(car);
        }

        assertEquals("car1 car2 ", outputStream.toString());
    }

    @Test
    public void printPosition(){
        for (Car car:cars){
            View.printPosition(car);
        }

        assertEquals("-\n\n", outputStream.toString());
    }

    @Test
    public void viewTest(){
        View.getResult(racingGame);
        assertEquals("car1 -\ncar2 \n", outputStream.toString());
    }
}
