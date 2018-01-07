package racing;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RacingResultUtilsTest {

    private List<RacingResult> results;

    @Before
    public void setUp() throws Exception {
        RacingResult result1 = new RacingResult("test1", 7);
        RacingResult result2 = new RacingResult("test2", 7);
        RacingResult result3 = new RacingResult("test3", 2);
        RacingResult result4 = new RacingResult("test4", 5);

        results = Arrays.asList(result1, result2, result3, result4);
    }

    @Test
    public void getBestCarNames() throws Exception {
        String result = RacingResultUtils.getBestCarNames(results);
        assertEquals("test1,test2", result);
    }

    @Test
    public void getBestResults() throws Exception {
        List<RacingResult> bestResults = RacingResultUtils.getBestResults(results);

        assertEquals(2, bestResults.size());
        assertEquals("test1", bestResults.get(0).getName());
        assertEquals("test2", bestResults.get(1).getName());
    }

    @Test
    public void getBiggestPosition() throws Exception {
        int biggestPosition = RacingResultUtils.getBiggestPosition(results);

        assertEquals(7, biggestPosition);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getBestCarNames_빈리스트() throws Exception {
        RacingResultUtils.getBestCarNames(Collections.emptyList());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getBestResults_빈리스트() throws Exception {
        RacingResultUtils.getBestResults(Collections.emptyList());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getBiggestPosition_빈리스트() throws Exception {
        RacingResultUtils.getBiggestPosition(Collections.emptyList());
    }

}