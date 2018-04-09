package racing;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RacingResultTest {
    @Test
    public void makeLastMentionTest(){
        List<String> value = Arrays.asList("brown","kevin");
        String target = RacingResult.getResultMention(value);
        String expected = "brown, kevin 최종 우승하였습니다.";

        assertThat(target).isEqualTo(expected);
    }
}