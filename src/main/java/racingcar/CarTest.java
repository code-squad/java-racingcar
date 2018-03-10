package racingcar;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
	Car passCar, failCar;
	
	@Before
	public void setUp() {
		passCar = new Car("passCar");
		failCar = new Car("failCar");
	}
	
	// move의 인자값이 4이상일 때, position이 1 증가.
	@Test
	public void movePass() {
		passCar.move(4);
		assertEquals(1, passCar.getPosition());
	}
	@Test
	public void failPass() {
		failCar.move(3);
		assertEquals(0, failCar.getPosition());
	}
	
}


