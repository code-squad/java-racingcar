package RacingGame;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CarTest {
	Car car;

	@Before
	public void setup(){
		car = new Car();
	}

	@Test
	public void movePosition_Y() {
		car.movePosition(7);
		assertEquals(1, car.getCarPosition());
	}

	@Test
	public void movePosition_N() {
		car.movePosition(3);
		assertEquals(0, car.getCarPosition());
	}

}
