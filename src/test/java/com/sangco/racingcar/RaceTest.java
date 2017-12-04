package com.sangco.racingcar;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class RaceTest {
	private Race race;
	private ArrayList<Car> cars;
	
	@Before public void setup() {
		race = new Race();
		String[] carNames = {"a", "b", "c"};
		cars = race.createCar(carNames);
	}
	
	@Test
	public void moveCarTest() {
		cars.get(0).movePosition(6);
		assertEquals(2, cars.get(0).getPosition());

		cars.get(0).movePosition(3);
		assertEquals(2, cars.get(0).getPosition());
	}
	
	@Test
	public void findMaxNumTest() {
		cars.get(0).movePosition(6);
		cars.get(0).movePosition(7);
		race.findMaxNum(cars);
		assertEquals(3, cars.get(0).getPosition());
	}

	@Test
	public void findWinnersTest() {
		cars.get(0).movePosition(6);
		cars.get(1).movePosition(7);
		assertEquals(Arrays.asList("a", "b"), race.compareScore(2, cars));
	}
}
