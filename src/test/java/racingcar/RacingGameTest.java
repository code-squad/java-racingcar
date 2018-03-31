package racingcar;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @author sangsik.kim
 */
public class RacingGameTest {

    @Test
    public void createCars() {
        RacingGame game = new RacingGame();
        List<Car> result = game.generateCars(10);
        assertThat(result.size()).isEqualTo(10);
    }

    @Test
    public void convertingPositionNumberToHyphen() {
        RacingGame game = new RacingGame();
        String result = game.convertingPositionNumberToHyphen(5);
        assertThat(result).isEqualTo("-----");
    }

    @Test
    public void runTest() {
        RacingGame game = new RacingGame();
        game.start(3, 5);
    }

}
