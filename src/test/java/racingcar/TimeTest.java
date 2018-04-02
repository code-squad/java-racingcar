package racingcar;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author sangsik.kim
 */
public class TimeTest {

    @Test
    public void 시간_생성_소모() {
        Time time1 = new Time(1);
        time1.spend();
        assertThat(time1.hasLeft()).isEqualTo(false);

        Time time2 = new Time(2);
        time2.spend();
        assertThat(time2.hasLeft()).isEqualTo(true);
    }
}
