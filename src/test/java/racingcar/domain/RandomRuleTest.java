package racingcar.domain;

import org.junit.Test;
import static org.junit.Assert.*;

public class RandomRuleTest {
	@Test
	public void getMoveMeterForReward테스트() {
		assertEquals(1, new RandomRule().getMoveMeterForReward());
	}
}
