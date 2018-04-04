package game;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {

    private RacingGame racingGame;

    @Before
    public void setUp() {
        final int carNo = 5;
        racingGame = new RacingGame(carNo);
    }

    @Test
    public void 자동차_배열_초기화() {
        List<Car> actual = racingGame.initCars(5);

        assertThat(actual).contains(new Car(),
                                    new Car(),
                                    new Car(),
                                    new Car(),
                                    new Car());
    }
}