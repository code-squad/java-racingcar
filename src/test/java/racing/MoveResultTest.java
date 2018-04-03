package racing;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

import java.util.Arrays;

public class MoveResultTest {

    @Test
    public void setMoveResultTest() {
        MoveResult result = new MoveResult();

        result.setMoveResult(Arrays.asList(1, 1, 1));
        assertThat(result.distances).isEqualTo(Arrays.asList("-", "-", "-"));

        result.setMoveResult(Arrays.asList(6, 7, 3));
        assertThat(result.distances).isEqualTo(Arrays.asList("------", "-------", "---"));
    }

    @Test
    public void getDistanceTest() {
        assertThat(MoveResult.getDistance(1)).isEqualTo("-");
        assertThat(MoveResult.getDistance(10)).isEqualTo("----------");
    }
}
