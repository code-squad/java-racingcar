package racing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RaceTest {

    private static final int MIN_COUNT = 1;
    private static final int MAX_COUNT = 10;

    private Race race;
    @Before
    public void setup() {
        Race race = new Race();
    }

    @Test
    public void 설정값_받기() {
        assertEquals(9,race.getCount());
    }
}