package racingcar.domain;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {
	@Test
	public void move테스트() {
		Car car = new Car();
		RandomRule randomRule = new RandomRule();
		if(randomRule.isValid()) {
			Assert.assertEquals(1, car.move(randomRule));
			return;
		}
		Assert.assertEquals(0, car.move(randomRule));
	}
}
