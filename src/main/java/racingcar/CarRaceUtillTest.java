package racingcar;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarRaceUtillTest {

	CarRaceUtill carRace;
	Car car;
	
	@Before
	public void setUp() {
		carRace = new CarRaceUtill(new String[] {"car1", "car2" , "car3"});
	}
	
	
	@Test
	public void carMovingTest() {
		car = carRace.getCars().get(0);
		assertEquals(true,car.move(4));
		assertEquals(false,car.move(3));
	}
	
	@Test
	public void findMaxPosition() {
		carRace.getCars().get(0).move(4);
		carRace.getCars().get(1).move(3);
		carRace.getCars().get(2).move(2);
		assertEquals(1, carRace.topPosition());
	}
	
	@Test
	public void findWinner() {
		carRace.getCars().get(0).move(4);
		int topPosition = carRace.topPosition();
		assertEquals("car1", carRace.getWinner(topPosition));		
	}
}
