package racingcar.domain;

import org.junit.Assert;
import org.junit.Test;

public class RuleMoveTest {
	@Test
	public void apply테스트() {
		RuleMove ruleMove = new RuleMove();
		Car car = new Car();
		Assert.assertEquals(1, ruleMove.apply(new RuleParameter(car, 4)).getCar().getTripMeter());
		Assert.assertEquals(1, ruleMove.apply(new RuleParameter(car, 3)).getCar().getTripMeter());
	}
}
