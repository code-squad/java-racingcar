package racingcar;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author sangsik.kim
 */
public class RacingGameTest {
    @Test
    public void 실행후_게임결과_반환확인() {
        RacingGame racingGame = new RacingGame(Arrays.asList("sangsik, sion, pobi"));

        GameResult gameResult = racingGame.run();

        assertThat(gameResult).isNotNull();
    }
}
