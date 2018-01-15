package racingcar;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CarsTest {
	Cars cars;

	@Before
	public void setUp() {
		String carNames[] = {"차1", "차2"};
	
		cars = new Cars();
		cars.setCar(carNames);
	

	}

	@Test
	public void findMaxScoreTest() {
		cars.getCar(0).movePosition(7);
		cars.getCar(1).movePosition(6);
		assertEquals(2, cars.findMaxScore());
	}

	@Test
	public void compareWinnerTest() {
		cars.getCar(0).movePosition(7);
		assertEquals("차1", cars.compareWinner(2).get(0));
	}

	@After
	public void tearDown() {
		cars = null;
	}
}
