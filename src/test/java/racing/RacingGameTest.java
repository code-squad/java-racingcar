package racing;

import static org.assertj.core.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;
import racing.player.Car;

import java.util.List;

public class RacingGameTest {
    RacingGame racingGame = null;

    @Before
    public void setUp() {
        String carNames = "galic,paprika,cobrabi";
        racingGame = new RacingGame(carNames);
    }

    @Test
    public void constructorTest() {

        assertThat(racingGame.cars).isNotEmpty().hasSize(3);

        assertThat(racingGame.cars).extracting("name", "position", "distance")
                .contains(tuple("galic", 0, ""))
                .contains(tuple("paprika", 0, ""))
                .contains(tuple("cobrabi", 0, ""));
    }

    @Test
    public void moveTest() {
        racingGame.move();
        assertThat(racingGame.cars).extracting("name", "position", "distance")
                .contains(tuple("galic", 0, ""))
                .contains(tuple("paprika", 1, "-"))
                .contains(tuple("cobrabi", 0, ""));

        racingGame.move();
        assertThat(racingGame.cars).extracting("name", "position", "distance")
                .contains(tuple("galic", 0, ""))
                .contains(tuple("paprika", 2, "--"))
                .contains(tuple("cobrabi", 1, "-"));

        racingGame.move();
        assertThat(racingGame.cars).extracting("name", "position", "distance")
                .contains(tuple("galic", 1, "-"))
                .contains(tuple("paprika", 3, "---"))
                .contains(tuple("cobrabi", 1, "-"));
    }

    @Test
    public void finishTest() {
        racingGame.move();
        assertThat(racingGame.cars).extracting("name", "position", "distance")
                .contains(tuple("galic", 0, ""))
                .contains(tuple("paprika", 1, "-"))
                .contains(tuple("cobrabi", 0, ""));

        racingGame.move();
        assertThat(racingGame.cars).extracting("name", "position", "distance")
                .contains(tuple("galic", 0, ""))
                .contains(tuple("paprika", 2, "--"))
                .contains(tuple("cobrabi", 1, "-"));

        racingGame.move();
        assertThat(racingGame.cars).extracting("name", "position", "distance")
                .contains(tuple("galic", 1, "-"))
                .contains(tuple("paprika", 3, "---"))
                .contains(tuple("cobrabi", 1, "-"));

        List<Car> cars = racingGame.finish().getWinner();
        assertThat(cars).isNotEmpty().hasSize(1);
        assertThat(cars).extracting("name", "position", "distance")
                .contains(tuple("paprika", 3, "---"));

    }
}



