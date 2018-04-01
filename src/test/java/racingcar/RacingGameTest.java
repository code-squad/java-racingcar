package racingcar;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {

    RacingGame racingGame;

    @Before
    public void setup() {
        racingGame = new RacingGame();
    }

    @Test
    public void 이동_출력() {
        String result = ResultView.printMove(3);
        assertThat(result).isEqualTo("---");
    }

    @Test
    public void 숫자4_미만_이동_불가능_확인() {
        boolean result = racingGame.isMoving(3);
        assertThat(result).isEqualTo(false);
    }

    @Test
    public void 숫자4_이상_이동_가능_확인() {
        boolean result = racingGame.isMoving(4);
        assertThat(result).isEqualTo(true);
    }
}
