package racingcar;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author sangsik.kim
 */
public class GameRecordTest {

    @Test
    public void 기록_저장_불러오기() {
        GameRecord gameRecord = new GameRecord();

        gameRecord.save(1, Arrays.asList(1, 0, 2, 3, 5));

        assertThat(gameRecord.load(1)).isEqualTo(Arrays.asList(1, 0, 2, 3, 5));
    }
}
