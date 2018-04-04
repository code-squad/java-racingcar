package racing.result;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import racing.player.Car;

import java.util.Arrays;

public class MoveResultTest {

    @Test
    public void setMoveResultTest() {
        Car galic = new Car("galic");
        galic.setPosition(3);

        Car paprika = new Car("paprika");
        paprika.setPosition(4);

        Car cobrabi = new Car("cobrabi");
        cobrabi.setPosition(5);

        MoveResult result = new MoveResult();
        result.setMoveResult(Arrays.asList(galic, paprika, cobrabi));

        assertThat(result.distances).contains("galic\t: ---", "paprika\t: ----", "cobrabi\t: -----");
    }
}
