package game.racingGame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ViewTest {

    @Mock
    RacingGame racingGame;

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setUp(){
        List<Car> cars = new ArrayList();

        Car car1 = new Car("car1");
        car1.move(4);
        cars.add(car1);

        Car car2 = new Car("car2");
        car2.move(3);
        cars.add(car2);


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
    public void viewTest(){
        View.getResult(racingGame);
        assertEquals("car1 -\ncar2 \n", outputStream.toString());
    }
}
