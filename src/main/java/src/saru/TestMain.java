package saru;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/////////////////////////////////////////

public class TestMain {
	static private Racing racing; // 누적 테스트용
	private Racing indiRacing;    // 개별 테스트용

	@BeforeClass
	static public void init() {
		racing = new Racing();
	}
	
	@Before
	public void indiInit() {
		indiRacing = new Racing();
		indiRacing.insertCar("뉴 테스트카0");
		indiRacing.insertCar("뉴 테스트카1");
		indiRacing.insertCar("뉴 테스트카2");
		
		indiRacing.moveAhead(9, 0);
		indiRacing.moveAhead(9, 1);
		indiRacing.moveAhead(9, 1);
		indiRacing.moveAhead(9, 1);
		indiRacing.moveAhead(9, 2);
		indiRacing.moveAhead(9, 2);
	}
	
	// [누적 테스트]
	// (1) 4이상의 값이 경우 위치 값이 1 증가했는가?
	@Test
	public void valueIncreasAboveFour() {
		racing.insertCar("테스트카1");
		
		// 4 ~ 9까지의 랜덤값 테스트
		int position = 1;
		for(int randValue = 4; randValue <= 9; randValue++) {
			racing.moveAhead(randValue, 0);

			assertEquals(1, racing.getSize()); // 갯수 1
			assertTrue(racing.checkMove(position, 0));
			position++;
		}
	}
	
	// (2) 4미만의 값일 경우 위치 값이 증가하지 않았는가?
	@Test
	public void valueIncreasBelowFour() {
		racing.insertCar("테스트카2");
		
		// 0 ~ 3 까지의 랜덤값 테스트
		for(int randValue = 0; randValue <= 3; randValue++) {
			racing.moveAhead(randValue, 1);
		
			assertEquals(2, racing.getSize()); // 갯수 2
			assertTrue(racing.checkMove(0, 1));
		}
	}
	
	// [개별 테스트]
	// (1) 자동차 목록의 위치 값이 가장 큰 값을 찾는 메소드
	@Test
	public void largestPosition() {
		Car bestCar = indiRacing.findBestCar();
		int bestPosition = bestCar.getPosition();
		
		assertEquals(3, bestPosition);
	}
	
	// (2) 자동차 목록에서 가장 큰 위치 값에 해당하는 자동차 목록을 구하는 메소드
	@Test
	public void getResultList() {
		ArrayList<Car> cars = indiRacing.getResultList();
		
		assertEquals("뉴 테스트카1", cars.get(0).getName());
	}
}
