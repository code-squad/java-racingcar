package com.sangco.racingcar;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class RaceTest {
	private Cars cars;

	@Before
	public void setup() {
		cars = new Cars();
		String[] carNames = { "a", "b", "c" };
		cars.addCar(carNames);
	}

	@Test
	public void moveCarTest() {
		cars.getGroupOfCar().get(0).movePosition(6);
		assertEquals(2, cars.getGroupOfCar().get(0).getPosition());

		cars.getGroupOfCar().get(0).movePosition(3);
		assertEquals(2, cars.getGroupOfCar().get(0).getPosition());
	}

	@Test
	public void findMaxNumTest() {
		cars.getGroupOfCar().get(0).movePosition(6);
		cars.getGroupOfCar().get(0).movePosition(7);
		assertEquals(3, cars.findMaxNum());
	}

	@Test
	public void findWinnersTest() {
		cars.getGroupOfCar().get(0).movePosition(6);
		cars.getGroupOfCar().get(1).movePosition(7);
		ArrayList<Car> winner = cars.findWinner(2);
		ArrayList<String> stringWinnerName = new ArrayList<>();
		for (Car car : winner) {
			stringWinnerName.add(car.getName());
		}
		assertEquals(Arrays.asList("a", "b"), stringWinnerName);
	}
}
