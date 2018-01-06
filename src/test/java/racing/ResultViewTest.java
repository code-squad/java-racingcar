package racing;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class ResultViewTest {

    private ResultView view;

    @Mock
    private RacingGame mockRacingGame;

    @Before
    public void setUp() throws Exception {
        doReturn(Arrays.asList(3, 5, 7))
            .when(mockRacingGame).moveAllCars();

        view = new ResultView(mockRacingGame, '*');
    }

    @Test
    public void print() throws Exception {
        List<String> lines = view.drawLines();

        assertEquals(lines.size(), 3);
        assertEquals(lines.get(0), "***");
        assertEquals(lines.get(1), "*****");
        assertEquals(lines.get(2), "*******");
    }

}