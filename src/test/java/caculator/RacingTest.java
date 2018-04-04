package caculator;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

import racing.Racing;

public class RacingTest {

    @Test
    public void 랜덤넘버제너레이트() {
        assertThat(Racing.generateRandomNumber()).isBetween(0, 9);
    }

    @Test
    public void 대쉬그리기() {
        assertThat(Racing.generateDash(3)).isEqualTo("---");
    }


}
