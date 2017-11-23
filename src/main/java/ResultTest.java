

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ResultTest {
	
	ArrayList<Car> cars;
	
	@Before
	public void setup() {
		cars = new ArrayList<>();
		cars.add(new Car("will", 3));
		cars.add(new Car("pobi", 4));
		cars.add(new Car("honux", 5));
	}
	
	@Test
	public void findMaxPosition () {
		assertEquals(5, Result.findMaxPosition(cars));
	}
	
	@Test
	public void findWinnerCar() {
		int max = Result.findMaxPosition(cars);
		assertEquals("honux", Result.findWinnerCar(cars, max).get(0).getName());
	}
	
	@After
	public void tearDown() {
		cars = null;
	}
}
