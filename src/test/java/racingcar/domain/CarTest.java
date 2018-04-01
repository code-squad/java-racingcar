package racingcar.domain;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {
	@Test
	public void move테스트() {
		Car car = new Car();
		Assert.assertEquals(5, car.move(5));
	}
}
