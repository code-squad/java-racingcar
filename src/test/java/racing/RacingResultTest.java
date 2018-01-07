package racing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RacingResultTest {

    private RacingResult result;

    @Before
    public void setUp() throws Exception {
        result = new RacingResult("test", 3);
    }

    @Test
    public void getResult() throws Exception {
        assertEquals("test : ---", result.getResult());
    }

    @Test(expected = IllegalArgumentException.class)
    public void RacingResult_빈문자열() throws Exception {
        new RacingResult("", 3);

    }

    @Test(expected = IllegalArgumentException.class)
    public void RacingResult_0보다작은값() throws Exception {
        new RacingResult("test", -1);
    }
}