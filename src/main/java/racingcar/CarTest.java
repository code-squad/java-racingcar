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
	
	@Test
	public void moveSuccess() {
		car.move(3);
		assertEquals(0, car.getPosition());
	}
	
	@Test
	public void moveFail() {
		car.move(4);
		assertEquals(1, car.getPosition());
	}
}
