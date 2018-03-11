package racingcar;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class CarRaceTest {
	private CarRaceUtill cars;
	
	@Before
	public void setup() {
		cars = new CarRaceUtill();
		String[] carNames = { "a", "b", "c"};
		cars.addCarNames(carNames);
	}
	
	@Test
	public void CarMoveTest() {
		cars.getCars().get(0).go(6);
		assertEquals(1, cars.getCars().get(0).getPosition());
		
		cars.getCars().get(0).go(3);
		assertEquals(1,cars.getCars().get(0).getPosition());
		
	}
	
	@Test
	public void findTopPosition() {
		cars.getCars().get(0).go(6);
		cars.getCars().get(0).go(7);
		assertEquals(2, cars.topPosition());
	}
	
	@Test
	public void findWinner() {
		cars.getCars().get(0).go(6);
		cars.getCars().get(1).go(7);
		ArrayList<Car> winner = cars.winner(1);
		ArrayList<String> stringWinnerName = new ArrayList<>();
		for (Car car : winner) {
			stringWinnerName.add(car.getName());
		}
		assertEquals(Arrays.asList("a","b"), stringWinnerName);
	}

}
