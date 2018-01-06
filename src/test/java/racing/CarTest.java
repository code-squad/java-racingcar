package racing;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class CarTest {

    private Car car;

    @Mock
    private MoveStrategy strategy;

    @Before
    public void setUp() throws Exception {
        car = new Car(strategy);
    }

    @Test
    public void move_4보다크거나같은경우() throws Exception {
        doReturn(5)
            .when(strategy)
            .move();

        int move = car.move();

        assertEquals(move, 5);
    }

    @Test
    public void move_4보다작은경우() throws Exception {
        doReturn(3)
            .when(strategy)
            .move();

        int move = car.move();

        assertEquals(move, 0);
    }
}