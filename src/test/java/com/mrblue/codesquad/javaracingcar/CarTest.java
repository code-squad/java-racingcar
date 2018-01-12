package com.mrblue.codesquad.javaracingcar;

import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;

import static com.mrblue.codesquad.helpers.TestHelper.invokeMethod;
import static org.junit.Assert.*;

/**
 * Created by kineo2k on 2018. 1. 6..
 * Email : kineo2k@gmail.com
 */
public class CarTest {
	private Car car;

	@Before
	public void setup() {
		this.car = Car.newCar("AstonMartin");
	}

	@Test
	public void test_move() {
		// TODO: move 메서드 테스트 방법을 연구해보자!
		// 코드 가독성이나 간결함이 좋아서 Stream API 사용을 선호하는데, 테스트가 어렵네요 ㅠ.ㅜ
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
		assertEquals(car, Car.newCar(null));
	}

	@Test
	public void test_getName() {
		assertEquals("AstonMartin", invokeMethod(car, "getName", String.class));
	}

	@Test
	public void test_getDistance() {
		assertEquals(0, invokeMethod(car, "getDistance", int.class).intValue());

		car.move(1);

		assertNotEquals(0, invokeMethod(car, "getDistance", int.class).intValue());
	}
}
