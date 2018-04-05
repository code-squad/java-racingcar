package racingcar.domain;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class RandomRuleTest {
	@Test
	public void getMoveMeterForReward테스트() {
		assertThat(new RandomRule().getMoveMeterForReward())
				.isEqualTo(1);
	}
}
