package racinggame;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RacingGameTest {

    @Test
    public void 자동차가_이동가능한_조건일때_예외발생() {
        assertTrue(getRacingGame().isMoveAble(4));
    }

    @Test
    public void 자동차가_이동불가능한_조건일때_예외발생() {
        assertFalse(getRacingGame().isMoveAble(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void 레이싱에_참여한_자동차가_null일_경우_예외발생() {
        new RacingGame(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 레이싱에_참여한_자동차가_0이면_예외발생() {
        new RacingGame(new ArrayList<>());
    }

    private RacingGame getRacingGame() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car());

        return new RacingGame(carList);
    }
}