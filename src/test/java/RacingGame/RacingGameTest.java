package RacingGame;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class RacingGameTest {
	RacingGame game;
	Car car;
	
	@Before
	public void setup(){
		car = new Car();
	}

	@Test
	public void moveYn_N() {
		assertEquals(0, car.moveYn(3));
	}

	@Test
	public void moveYn_Y() {
		assertEquals(1, car.moveYn(5));
	}
}