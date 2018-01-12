package com.mrblue.codesquad.javaracingcar;

import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;

import static com.mrblue.codesquad.testutil.TestUtil.invokeMethod;
import static org.junit.Assert.*;

/**
 * Created by kineo2k on 2018. 1. 6..
 * Email : kineo2k@gmail.com
 */
public class CarTest {
	private Car car;

	@Before
	public void setup() {
		this.car = Car.newCar(5);
	}

	@Test
	public void test_randomNumber() {
		// Repeat 자동으로 안될까요?
		IntStream.rangeClosed(1, 10000)
				 .forEach(index -> {
					 final int randomNumber = invokeMethod(car, "randomNumber", Integer.class);
					 assertTrue(randomNumber >= 0 && randomNumber < 10);
				 });
	}

	@Test
	public void test_isAllowRange() {
		assertFalse(invokeMethod(car, "isAllowRange", boolean.class, int.class, 3));
		assertTrue(invokeMethod(car, "isAllowRange", boolean.class, int.class, 4));
		assertTrue(invokeMethod(car, "isAllowRange", boolean.class, int.class, 9));
		assertFalse(invokeMethod(car, "isAllowRange", boolean.class, int.class, 10));
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_newCar() {
		assertEquals(car, Car.newCar(-1));
	}
}
