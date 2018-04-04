import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class RacingTest {
    //MEMO: UI는 테스트하지 않아도 됨
    //view 와 logic을 나누면서 바뀐 구조에 테스트를 못 만들겠습니다ㅠ

    @Test
    public void 한바퀴_누적결과(){
        int[] expect = new int[] { 1, 1, 1};
        RandomRule rule = new RandomRule(false);
        Racing racing = new Racing(3,3);
        assertThat(racing.move(rule)).isEqualTo(expect);
    }
}
