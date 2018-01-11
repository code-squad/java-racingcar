package racing;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RaceTest {

    private final String CAR_NAMES[] = {"pobi","crong","honux"};
    private final String JOIN_STRING = ", ";
    private final String JOINED_CAR_NAMES = Stream.of(CAR_NAMES).collect(Collectors.joining(JOIN_STRING));
    private final int TRY_COUNT = 5;
    private final int MIN_FORWARD_NUMBER = 4;
    private final int RANDOM_BOUND = 10;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final String CAR_RESULT_FORM = "%s : ";
    private RaceGame race;
    String expectedString;

    @Before
    public void setup() {
        race = new RaceGame();
        race.initRace(CAR_NAMES, TRY_COUNT);
        System.setOut(new PrintStream(outContent));
        expectedString = "";
    }

    @Test
    public void UI_숫자_입력_로직_체크_NOT_NUMERIC_STRING() {
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
    public void UI_숫자_입력_로직_체크_NUMERIC_STRING() {
        assertTrue(InputView.isOutOfNumber("-1"));
        assertTrue(InputView.isOutOfNumber("0"));
        assertTrue(InputView.isOutOfNumber("101"));
        assertFalse(InputView.isOutOfNumber("100"));
    }

    @Test
    public void UI_이름_입력_로직_체크() {
        String carName = CAR_NAMES[0];
        assertTrue(InputView.isInvalidNameInput(null));
        assertTrue(InputView.isInvalidNameInput(new String()));
        assertTrue(InputView.isInvalidNameInput(""));

        assertTrue(InputView.isInvalidNameInput(","));
        assertTrue(InputView.isInvalidNameInput(" , , "));

        assertTrue(InputView.isInvalidNameInput(carName));
        assertTrue(InputView.isInvalidNameInput(","+carName));
        assertTrue(InputView.isInvalidNameInput(carName+", "));

        assertFalse(InputView.isInvalidNameInput(carName+","));
        assertFalse(InputView.isInvalidNameInput(JOINED_CAR_NAMES));
    }

    @Test
    public void 자동차_경주_로직_빈칸_출력() {
        String carName = CAR_NAMES[0];
        String nameSection = String.format(CAR_RESULT_FORM, carName);
        RacingCar racingCar = new RacingCar(carName);
        for (int i = 0; i < MIN_FORWARD_NUMBER; i++) {
            racingCar.move(i);
        }
        expectedString+=nameSection+"\n";
        racingCar.printCarDistance();
        assertEquals(expectedString, outContent.toString());
    }

    @Test
    public void 자동차_경주_로직_거리_출력() {
        String carName = CAR_NAMES[0];
        String nameSection = String.format(CAR_RESULT_FORM, carName);
        RacingCar racingCar = new RacingCar(carName);
        String bar = "-";
        expectedString+=nameSection;
        for (int i = MIN_FORWARD_NUMBER; i < RANDOM_BOUND; i++) {
            racingCar.move(i);
            expectedString+=bar;
        }
        expectedString+="\n";
        racingCar.printCarDistance();
        assertEquals(expectedString, outContent.toString());
    }

    @Test
    public void 경주_결과_확인_모든_차량이_우승한다() {
        List<RacingCar> racingCars = new ArrayList<>();
        for (int i = 0; i < CAR_NAMES.length; i++) {
            RacingCar racingCar = new RacingCar(CAR_NAMES[i]);
            racingCar.move(MIN_FORWARD_NUMBER);
            racingCars.add(racingCar);
        }
        assertEquals(JOINED_CAR_NAMES, race.getWinnerName(racingCars));
    }

    @Test(expected = RuntimeException.class)
    public void 경주_결과_예외처리_확인() {
        RaceGame race = new RaceGame();
        race.printResult();
    }
}