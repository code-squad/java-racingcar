package racingcar.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import racingcar.*;

public class CarResultTest {

	Car[] car = null;
	Car test1;
	Car test2;
	Car test3;

	@Before
	public void setUp() {
		test1 = new Car("test1");
		test2 = new Car("test2");
		test3 = new Car("test3");
		car = new Car[] { test1, test2, test3 };
	}

	@Test
	public void testMaxCompare() {
		// test1의 포지션이 2인경우를 가정
		test1.updatePosition();
		test1.updatePosition();

		int max = 0;
		for (int i = 0; i < car.length; i++) {
			if (max < car[i].getPosition()) {
				max = car[i].getPosition();
				assertEquals(2, car[0].getPosition());
			}
		}
	}

	// 자동차 목록의 위치 값이 가장 큰 값을 찾는 메소드에 대한 테스트 코드를 추가한다.
	@Test
	public void testMaxCompareResult() {
		int max = 0;
		// test1의 포지션이 2인경우를 가정
		test1.updatePosition();
		test1.updatePosition();

		if (max < car[0].getPosition()) {
			max = car[0].getPosition();
		}
		assertEquals(2, max);
	}

	@Test
	public void testWinnerCheck() {
		// 자동차 목록에서 가장 큰 위치 값에 해당하는 자동차 목록을 구하는 메소드에 대한 테스트 코드를 추가한다.
		int max = 2;
		test1.updatePosition();
		test1.updatePosition();
		for (int i = 0; i < car.length; i++) {
			if (max == car[i].getPosition()) {
				assertEquals(max, car[0].getPosition());
			}
		}
	}

	@Test
	public void testWinnerResult() {
		int max = 2;
		test1.updatePosition();
		test1.updatePosition();

		if (max == car[0].getPosition()) {
			assertEquals("test1", car[0].getName());
		}
	}
	
	
	

}