package race;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class RecorderTest {
    private Recorder recorder;

    @Before
    public void setUp() {
        recorder = new Recorder();
    }

    @Test
    public void int_값을_기록할_수_있다() {
        //given
        List<Integer> expected = Arrays.asList(1, 2, 3);
        
        //when
        recorder.record(expected.get(0));
        recorder.record(expected.get(1));
        recorder.record(expected.get(2));

        //then
        Assert.assertArrayEquals(expected.toArray(), recorder.getRecords().toArray());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void 존재하지_않는_기록을_참조하면_예외가_발생한다() {
        //when
        recorder.getRecord(10);

        //then
        Assert.fail("존재하지 않는 기록을 참조하면 예외가 발생해야 한다.");
    }

    @Test
    public void 기록이_없으면_최종_기록은_0이다() {
        Assert.assertThat(recorder.getLastRecord(), is(0));
    }
}