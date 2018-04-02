package racingcar.domain;

import org.junit.Assert;
import org.junit.Test;

public class RandomRuleTest {
	@Test
	public void getMoveMeterForReward테스트() {
		Assert.assertEquals(1, new RandomRule().getMoveMeterForReward());
	}
}
