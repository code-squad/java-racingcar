package com.sangco.racingcar;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class RaceTest {
	private Race race;
	private ArrayList<Car> carIns;
	
	@Before public void setup() {
		race = new Race();
		carIns = new ArrayList<>();
		String[] carNames = {"a", "b", "c"};
		race.createCar(carIns, carNames);
	}
	
	@Test
	public void moveCarTest() {
		carIns.get(0).movePosition(6);
		assertEquals(2, carIns.get(0).position);

		carIns.get(0).movePosition(3);
		assertEquals(2, carIns.get(0).position);
	}
	
	@Test
	public void findMaxNumTest() {
		carIns.get(0).movePosition(6);
		carIns.get(0).movePosition(7);
		race.findMaxNum(carIns);
		assertEquals(3, carIns.get(0).position);
	}
	
	@Test
	public void findWinnersTest() {
		carIns.get(0).movePosition(6);
		carIns.get(1).movePosition(7);
		race.compareScore(2, carIns);
		ArrayList<String> testResult = new ArrayList<>();
		testResult.add("a");
		testResult.add("b");
		assertEquals(testResult, race.winners);
	}
}
