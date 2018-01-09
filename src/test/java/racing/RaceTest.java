package racing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RaceTest {

    private Race race;
    private final static int CAR_COUNT = 3;
    private final static int TRY_COUNT = 5;

    @Before
    public void setup() {
        race = new Race();
        race.initRace(CAR_COUNT, TRY_COUNT);
    }

    @Test(expected = RuntimeException.class)
    public void 경주차량_객체_등록_테스트_예외처리() {
        RaceVO vo = new RaceVO();
        vo.enrollCars();
    }

    @Test
    public void UI_로직_체크_NOT_NUMERIC_STRING() {
        assertTrue(race.isOutOfNumber(null));
        assertTrue(race.isOutOfNumber(new String()));
        assertTrue(race.isOutOfNumber(""));
        assertTrue(race.isOutOfNumber("a12"));
        assertTrue(race.isOutOfNumber("가나다"));
        assertTrue(race.isOutOfNumber("\n"));
    }

    /**
     * 경주 가능한 차량 및 시도 횟수 제한 : 1 ~ 100
     */
    @Test
    public void UI_로직_체크_NUMERIC_STRING() {
        assertTrue(race.isOutOfNumber("-1"));
        assertTrue(race.isOutOfNumber("0"));
        assertTrue(race.isOutOfNumber("101"));

        assertFalse(race.isOutOfNumber("100"));
    }

    @Test
    public void 랜덤_로직_바운드_확인(){
        for (int i = 0; i < 1000; i++) {
            int random = race.getRandom();
            assertTrue(random > -1 && random < 10);
        }
    }

    @Test
    public void 경주_결과_확인() {
        race.racing();
        race.printResult();
    }

    @Test(expected = RuntimeException.class)
    public void 경주_결과_예외처리_확인() {
        Race race = new Race();
        race.printResult();
    }

}