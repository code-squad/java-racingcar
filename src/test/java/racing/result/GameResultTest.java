package racing.result;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import racing.player.Car;

import java.util.Arrays;
import java.util.List;

public class GameResultTest {

    @Test
    public void isBestPositionTest() {
        assertThat(GameResult.getBestPosition(10, 9)).isEqualTo(10);
        assertThat(GameResult.getBestPosition(3, 4)).isEqualTo(4);
    }

    @Test
    public void getWinnersTest() {
        Car garlic = new Car("garlic", 1);
        Car paprika = new Car("paprika", 3);
        Car coblabi = new Car("coblabi", 3);

        List<Car> winners = GameResult.getWinners(Arrays.asList(garlic, paprika, coblabi));

        assertThat(winners).isNotEmpty().hasSize(2);
        assertThat(winners).extracting("name", "position")
                .contains(tuple("paprika", 3))
                .contains(tuple("coblabi", 3));

    }

    @Test
    public void getWinnerNamesTest() {
        Car garlic = new Car("garlic", 1);
        Car paprika = new Car("paprika", 3);
        Car coblabi = new Car("coblabi", 3);

        List<Car> winners = GameResult.getWinners(Arrays.asList(garlic, paprika, coblabi));

        String winnerNames = GameResult.getWinnerNames(winners);
        assertThat(winnerNames).isEqualTo("paprika, coblabi");
    }
}
