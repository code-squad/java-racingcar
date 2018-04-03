package racinggame;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RacingGameTest {

    @Test
    public void 자동차가_이동가능한_조건일때_예외발생() {
        assertTrue(new Car("pobi").isMoveAble(4));
    }

    @Test
    public void 자동차가_이동불가능한_조건일때_예외발생() {
        assertFalse(new Car("pobi").isMoveAble(3));
    }

    @Test
    public void 자동차가_정상적으로_이동해야한다() {
        Car car = new Car("pobi");
        car.move(6);

        assertEquals(1, car.getPosition());
    }

    @Test
    public void 자동차가_정상적으로_이동하지_않았어야_한다() {
        Car car = new Car("pobi");
        car.move(3);

        assertEquals(0, car.getPosition());
    }

    @Test(expected = IllegalArgumentException.class)
    public void 레이싱에_참여한_자동차가_null일_경우_예외발생() {
        RacingGameView racingGameView = new DefaultRacingGameView();
        new RacingGame(null, racingGameView);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 레이싱에_참여한_자동차가_0이면_예외발생() {
        RacingGameView racingGameView = new DefaultRacingGameView();
        new RacingGame(new ArrayList<>(), racingGameView);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 레이싱게임_관전용_View가_null일_경우_예외발생() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("pobi"));
        new RacingGame(carList, null);
    }
}