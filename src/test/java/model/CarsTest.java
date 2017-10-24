package model;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class CarsTest {
	Cars cars;
	
	@Before
	public void setUp() {
		cars = new Cars();
	}

	@Test
	public void makeCars() {
		List<Car> carsList = new ArrayList<Car>();
		carsList.add(new Car("a"));
		carsList.add(new Car("b"));
		carsList.add(new Car("c"));
		assertEquals(carsList, cars.makeCars("a, b, c"));

	}
	@Test
	public void getMaxPosition() {
		List<Car> carsList = new ArrayList<Car>();
		Car c1 = new Car("a");
		c1.setPosition(1);
		carsList.add(c1);
		Car c2 = new Car("b");
		c1.setPosition(2);
		carsList.add(c2);
		
		assertEquals(2, cars.testMaxPosition(carsList));
	}
	@Test
	public void getWinner() {
		List<String> winners = new ArrayList<String>();
		List<Car> carsList = new ArrayList<Car>();
		Car c1 = new Car("a");
		c1.setPosition(1);
		carsList.add(c1);
		Car c2 = new Car("b");
		c2.setPosition(2);
		carsList.add(c2);
		winners.add("b");
		assertEquals(winners, cars.testWinner(carsList));
	}
}
