package racingcar;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
	Car car;

	@Before
	public void setUp() {
		car = new Car("testCar");
	}

	// move의 인자값이 4이상일 때, position이 1 증가.
	@Test
	public void movePass() {
		assertTrue(car.move(4));
	}

	@Test
	public void failPass() {
		assertFalse(car.move(3));
	}
}
