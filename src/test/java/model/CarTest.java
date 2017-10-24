package model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CarTest {

	Car car;
	
	@Before
	public void setUp() {
		car = new Car("car");
		car.setPosition(2);
	}
	
	@Test
	public void testMove() {
		assertEquals(3, car.testMove());
	}

}
