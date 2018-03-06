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
	    car = new Car[]{test1, test2, test3}; 
	}
	

	
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
