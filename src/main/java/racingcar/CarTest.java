package racingcar;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CarTest {
	Car car;

	@Before
	public void setUp() {
		car = new Car("차");
	}

	@Test
	public void movePositionTest() {
		car.movePosition(5);
		assertEquals(2, car.getPosition());

		car.movePosition(1);
		assertEquals(2, car.getPosition());
	}

	@After
	public void tearDown() {
		car = null;
	}
}
