package racing;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RaceTest {

    private final String CAR_NAMES[] = {"pobi","crong","honux"};
    private final int MIN_FORWARD_NUMBER = 4;

    OutputView outputView;

    @Before
    public void setup() {
        outputView = OutputView.getInstance();
    }

    @Test
    public void UI_숫자_입력_로직_체크_NOT_NUMERIC_STRING() {
        assertTrue(InputValidationUtil.isOutOfNumber(null));
        assertTrue(InputValidationUtil.isOutOfNumber(new String()));
        assertTrue(InputValidationUtil.isOutOfNumber(""));
        assertTrue(InputValidationUtil.isOutOfNumber("a12"));
        assertTrue(InputValidationUtil.isOutOfNumber("가나다"));
        assertTrue(InputValidationUtil.isOutOfNumber("\n"));
    }

    /**
     * 경주 가능한 차량 및 시도 횟수 제한 : 1 ~ 100
     */
    @Test
    public void UI_숫자_입력_로직_체크_NUMERIC_STRING() {
        assertTrue(InputValidationUtil.isOutOfNumber("-1"));
        assertTrue(InputValidationUtil.isOutOfNumber("0"));
        assertTrue(InputValidationUtil.isOutOfNumber("101"));
        assertFalse(InputValidationUtil.isOutOfNumber("100"));
    }

    @Test
    public void UI_이름_입력_로직_체크() {
        String splitSymbol = InputValidationUtil.SPLIT_SYMBOL;
        String carName = CAR_NAMES[0];
        assertTrue(InputValidationUtil.isInvalidNameInput(null));
        assertTrue(InputValidationUtil.isInvalidNameInput(new String()));
        assertTrue(InputValidationUtil.isInvalidNameInput(""));

        assertTrue(InputValidationUtil.isInvalidNameInput(splitSymbol));
        assertTrue(InputValidationUtil.isInvalidNameInput(" "+splitSymbol+" "+splitSymbol+" "));

        assertTrue(InputValidationUtil.isInvalidNameInput(carName));
        assertTrue(InputValidationUtil.isInvalidNameInput(splitSymbol+carName));
        if(!splitSymbol.equals(" ")) {
            assertTrue(InputValidationUtil.isInvalidNameInput(carName+splitSymbol+" "));// 빈칸이 SPLIT_SYMBOL일 경우, trim이 있기 때문에 결과가 달라진다.
        }
        assertFalse(InputValidationUtil.isInvalidNameInput(carName+splitSymbol));

        String joinedNames = Stream.of(CAR_NAMES).collect(Collectors.joining(OutputView.JOIN_STRING));
        assertFalse(InputValidationUtil.isInvalidNameInput(joinedNames));
    }

    @Test
    public void 자동차_경주_전진_로직_특정_수_미만시_미작동() {
        String carName = CAR_NAMES[0];
        RacingCar racingCar = new RacingCar(carName);
        for (int i = 0; i < MIN_FORWARD_NUMBER; i++) {
            racingCar.move(i);
        }
        assertEquals(0, racingCar.getDistance());
    }

    @Test
    public void 자동차_경주_전진_로직_특정_수_이상시_작동() {
        int randomBound = 10;
        String carName = CAR_NAMES[0];
        RacingCar racingCar = new RacingCar(carName);
        for (int i = MIN_FORWARD_NUMBER; i < randomBound; i++) {
            racingCar.move(i);
        }
        assertEquals(randomBound-MIN_FORWARD_NUMBER, racingCar.getDistance());
    }

    @Test
    public void 경주_거리_기록으로_변환() {
        String recordSymbol = "-";
        assertEquals("",outputView.distanceToRecord(0));
        assertEquals(recordSymbol,outputView.distanceToRecord(1));
        assertEquals(recordSymbol+recordSymbol, outputView.distanceToRecord(2));
    }

    @Test
    public void UI_출력_결과_확인_모든_차량이_우승한다() {
        List<RacingCar> racingCars = new ArrayList<>();
        for (int i = 0; i < CAR_NAMES.length; i++) {
            RacingCar racingCar = new RacingCar(CAR_NAMES[i]);
            racingCar.move(MIN_FORWARD_NUMBER);
            racingCars.add(racingCar);
        }
        String joinedNames = Stream.of(CAR_NAMES).collect(Collectors.joining(OutputView.getInstance().JOIN_STRING));
        assertEquals(joinedNames, outputView.getWinnerName(racingCars));
    }

    @Test(expected = RuntimeException.class)
    public void UI_출력_결과_예외처리_확인() {
        RaceGame race = new RaceGame();
        race.getResult();
    }
}