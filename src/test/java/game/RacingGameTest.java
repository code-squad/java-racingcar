package game;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {

    private RacingGame racingGame;

    @Before
    public void setUp() {
        final int time = 3;
        final int carCount = 5;

        racingGame = RacingGame.of(time, carCount);
    }

    @Test
    public void 자동차_배열_초기화() {
        List<Car> actual = racingGame.initCars(5);

        assertThat(actual).contains(Car.newInstance(),
                                    Car.newInstance(),
                                    Car.newInstance(),
                                    Car.newInstance(),
                                    Car.newInstance());
    }
}