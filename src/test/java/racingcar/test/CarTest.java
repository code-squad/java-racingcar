package racingcar.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import racingcar.Car;

public class CarTest {
	Car car;

	@Before
	public void setUp() {
		car = new Car("test");
	}

	@Test
	public void testUpdatePosition() {
		int rNum = 5;
		if (rNum > 4) {
			car.updatePosition();
		}
		assertEquals(1, car.getPosition());
	}

	@Test
	public void testUpdatePositionOtherwise() {
		int rNum = 3;
		if (rNum > 4) {
			car.updatePosition();
		}
		assertEquals(0, car.getPosition());
	}
}