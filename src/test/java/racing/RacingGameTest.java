package racing;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class RacingGameTest {

    private RacingGame game;

    @Mock
    private Car car1;

    @Mock
    private Car car2;

    private int times = 3;

    @Before
    public void setUp() throws Exception {
        game = new RacingGame(new Car[] {car1, car2}, times);
    }

    @Test
    public void moveAllCars() throws Exception {
        doReturn(5)
            .when(car1)
            .move();

        doReturn(6)
            .when(car2)
            .move();

        List<Integer> result = game.moveAllCars();

        assertEquals(2, result.size());
        assertEquals(5 * times, result.get(0).intValue());
        assertEquals(6 * times, result.get(1).intValue());
    }

}