package racing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RaceTest {

    private Race race;
    private final int CAR_COUNT = 3;
    private final int TRY_COUNT = 5;
    @Before
    public void setup() {
        race = new Race();
        race.setCarCount(CAR_COUNT);
        race.setMaxMoveCount(TRY_COUNT);
    }

    @Test
    public void 경주차량_객체_등록_테스트() {
        race.enrollRacingCars();
        for (int i= 0; i < race.getCarCount(); i++) {
            Car car = race.getCarList().get(i);
            assertEquals(i, car.getNumber());
            assertEquals(0, car.getDistance());
        }
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
        race.enrollRacingCars();
        race.racing();
        race.printResult();
    }

}