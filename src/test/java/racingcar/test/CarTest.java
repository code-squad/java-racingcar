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
		car.updatePosition(5);
		assertEquals(1, car.getPosition());
	}

	@Test
	public void testUpdatePositionOtherwise() {
		car.updatePosition(3);
		assertEquals(0, car.getPosition());
	}
}