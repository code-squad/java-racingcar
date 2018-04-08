package game.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {

    private RacingGame racingGame;
    private final String carName = "pobi,crong,honux";

    @Before
    public void setUp() {
        racingGame = new RacingGame(carName);
    }

    @Test
    public void 자동차_배열_초기화() {
        List<Car> actual = racingGame.initCars(carName);

        assertThat(actual).contains(new Car(0, "pobi"),
                                    new Car(0, "crong"),
                                    new Car(0, "honux"));
    }
}