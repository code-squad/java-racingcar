package racing.result;

import static org.assertj.core.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;
import racing.player.Car;
import racing.result.GameResult;

public class GameResultTest {

    GameResult result;

    @Before
    public void setUp() throws Exception {
        Car galic = new Car("galic");
        galic.setPosition(7);

        Car paprika = new Car("paprika");
        paprika.setPosition(10);

        Car cobrabi = new Car("cobrabi");
        cobrabi.setPosition(10);

        result = new GameResult();
        result.ranking(galic);
        result.ranking(paprika);
        result.ranking(cobrabi);
    }

    @Test
    public void rankingTest() {

        assertThat(result.getWinner()).isNotEmpty().hasSize(2);
        assertThat(result.getWinner()).extracting("name", "position", "distance")
                .contains(tuple("paprika", 10, "----------"))
                .contains(tuple("cobrabi", 10, "----------"));

    }

    @Test
    public void getWinnerNameTest() {
        assertThat(result.getWinnerName()).isEqualTo("paprika, cobrabi");
    }
}
