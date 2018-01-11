package game.racingGame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
        Map<String, Integer> expectresult = new LinkedHashMap();
        expectresult.put("car1", 1);
        expectresult.put("car2", 0);

        cars = Arrays.asList(
            new Car("car1", 1), new Car("car2", 0)
        );

        racingGame = mock(RacingGame.class);

        when(racingGame.getCars()).thenReturn(cars);
        when(racingGame.getTrialTime()).thenReturn(5);
        when(racingGame.getResult()).thenReturn(expectresult);
        when(racingGame.getWinnersName()).thenReturn(Arrays.asList("car1"));

        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void cleanUp(){
        System.setOut(null);
    }

    @Test
    public void printResult(){
        View.printResult(racingGame);
        assertEquals("car1 -\ncar2 \ncar1 ", outputStream.toString());
    }
}
