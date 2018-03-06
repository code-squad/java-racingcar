package racingcar.test;

import static org.junit.Assert.*;

import org.junit.Test;
import racingcar.*;

public class CarResultTest {

	Car test1 = new Car("테스트1");
	Car test2 = new Car("테스트2");
	Car test3 = new Car("테스트3");
	Car[] car = { test1, test2, test3 };

	@Test
	public void testMaxCompare() { 
//		자동차 목록의 위치 값이 가장 큰 값을 찾는 메소드에 대한 테스트 코드를 추가한다.
		test1.updatePosition();
		int max = 0;
		for (int i = 0; i < car.length; i++) {
			if (max < car[i].getPosition()) {
				max = car[i].getPosition();
			}
		}
		assertEquals(max, test1.getPosition());
	}

	@Test
	public void textMax() {
//		자동차 목록에서 가장 큰 위치 값에 해당하는 자동차 목록을 구하는 메소드에 대한 테스트 코드를 추가한다.
		int max = 2;
		for (int i = 0; i < car.length; i++) {
			if (max == car[i].getPosition()) {
				assertEquals(max, car[i].getPosition());
			}
		}

	}

}
