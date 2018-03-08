package racingcar.test;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import racingcar.Car;

public class CarTest { // 자동차를 이동(move 메소드)하는 메소드에 대한 테스트 코드를 추가한다.
	Car car;

	@Before
	public void setUp() {
		car = new Car("test");
	}

	@Test
	public void testUpdatePosition() {
		// 4이상의 값이 경우 위치 값이 1 증가했는가?
		int rNum = 5;
		if (rNum > 4) {
			car.updatePosition();
		}
		assertEquals(1, car.getPosition());
	}

	@Test
	public void testUpdatePositionOtherwise() {
		// 4미만의 값일 경우 위치 값이 증가하지 않았는가?
		int rNum = 3;
		if (rNum > 4) {
			car.updatePosition();
		}
		assertEquals(0, car.getPosition());
	}

}