package race.domain;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class RecorderTest {
    private Recorder recorder;

    @Before
    public void setUp() {
        recorder = new Recorder();
    }

    @Test
    public void int_값을_기록할_수_있다() {
        //when
        recorder.record(1);
        recorder.record(2);
        recorder.record(3);

        //then
        Assertions.assertThat(recorder.getRecords()).containsExactly(1, 2, 3);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void 존재하지_않는_기록을_참조하면_예외가_발생한다() {
        //when
        recorder.getRecord(10);

        //then
        Assertions.fail("존재하지 않는 기록을 참조하면 예외가 발생해야 한다.");
    }

    @Test
    public void 기록이_없으면_최종_기록은_0이다() {
        Assertions.assertThat(recorder.getLastRecord()).isZero();
    }
}