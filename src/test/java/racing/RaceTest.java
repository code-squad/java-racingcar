package racing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RaceTest {

    private RaceGame race;
    private final static int CAR_COUNT = 3;
    private final static int TRY_COUNT = 5;

    @Before
    public void setup() {
        race = new RaceGame();
        race.initRace(CAR_COUNT, TRY_COUNT);
    }

    @Test
    public void UI_로직_체크_NOT_NUMERIC_STRING() {
        assertTrue(InputView.isOutOfNumber(null));
        assertTrue(InputView.isOutOfNumber(new String()));
        assertTrue(InputView.isOutOfNumber(""));
        assertTrue(InputView.isOutOfNumber("a12"));
        assertTrue(InputView.isOutOfNumber("가나다"));
        assertTrue(InputView.isOutOfNumber("\n"));
    }

    /**
     * 경주 가능한 차량 및 시도 횟수 제한 : 1 ~ 100
     */
    @Test
    public void UI_로직_체크_NUMERIC_STRING() {
        assertTrue(InputView.isOutOfNumber("-1"));
        assertTrue(InputView.isOutOfNumber("0"));
        assertTrue(InputView.isOutOfNumber("101"));
        assertFalse(InputView.isOutOfNumber("100"));
    }

    @Test
    public void 경주_결과_확인() {
        race.printResult();
    }

    @Test(expected = RuntimeException.class)
    public void 경주_결과_예외처리_확인() {
        RaceGame race = new RaceGame();
        race.printResult();
    }
}