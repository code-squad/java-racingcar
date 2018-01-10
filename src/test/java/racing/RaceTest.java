package racing;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class RaceTest {

    private final int CAR_COUNT = 3;
    private final int TRY_COUNT = 5;
    private final int MIN_FORWARD_NUMBER = 4;
    private final int RANDOM_BOUND = 10;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private RaceGame race;
    String expectedString;

    @Before
    public void setup() {
        race = new RaceGame();
        race.initRace(CAR_COUNT, TRY_COUNT);
        System.setOut(new PrintStream(outContent));
        expectedString = "";
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
    public void 자동차_경주_로직_빈칸_출력() {
        RacingCar racingCar = new RacingCar();
        for (int i = 0; i < MIN_FORWARD_NUMBER; i++) {
            racingCar.move(i);
        }
        expectedString+="\n";
        racingCar.printCarDistance();
        assertEquals(expectedString, outContent.toString());
    }

    @Test
    public void 자동차_경주_로직_거리_출력() {
        RacingCar racingCar = new RacingCar();
        String bar = "-";
        for (int i = MIN_FORWARD_NUMBER; i < RANDOM_BOUND; i++) {
            racingCar.move(i);
            expectedString+=bar;
        }
        expectedString+="\n";
        racingCar.printCarDistance();
        assertEquals(expectedString, outContent.toString());
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