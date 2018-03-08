package saru;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

/////////////////////////////////////////

public class RacingTest {
	private Racing indiRacing; 
	
	@Before
	public void indiInit() {
		indiRacing = new Racing();
		indiRacing.insertCar("테스트카0");
		indiRacing.insertCar("테스트카1");
		indiRacing.insertCar("테스트카2");
		
		indiRacing.moveAhead(9, 0);
		indiRacing.moveAhead(9, 1);
		indiRacing.moveAhead(9, 1);
		indiRacing.moveAhead(9, 1);
		indiRacing.moveAhead(9, 2);
		indiRacing.moveAhead(9, 2);
	}
	
	// (1) 4이상의 값이 경우 위치 값이 1 증가했는가?
	@Test
	public void valueIncreasAboveFour() {
		indiRacing.insertCar("테스트카3");
		
		// 4 ~ 9까지의 랜덤값 테스트
		int position = 1;
		for(int randValue = 4; randValue <= 9; randValue++) {
			indiRacing.moveAhead(randValue, 3);

			assertEquals(4, indiRacing.getListSize());
			assertTrue("맞냐", indiRacing.checkMove(position, 3));
			position++;
		}
	}
	
	// (2) 4미만의 값일 경우 위치 값이 증가하지 않았는가?
	@Test
	public void valueIncreasBelowFour() {
		indiRacing.insertCar("테스트카3");
		
		// 0 ~ 3 까지의 랜덤값 테스트
		for(int randValue = 0; randValue <= 3; randValue++) {
			indiRacing.moveAhead(randValue, 3);
		
			assertEquals(4, indiRacing.getListSize());
			assertTrue(indiRacing.checkMove(0, 3));
		}
	}
	
//////////////////////////////////////////////////////////////////
	
	// (3) 자동차 목록의 위치 값이 가장 큰 값을 찾는 메소드
	@Test
	public void largestPosition() {
		Car bestCar = indiRacing.findBestCar();
		int bestPosition = bestCar.getPosition();
		
		assertEquals(3, bestPosition);
	}
	
	// (4) 자동차 목록에서 가장 큰 위치 값에 해당하는 자동차 목록을 구하는 메소드
	@Test
	public void getResultList() {
		ArrayList<Car> cars = indiRacing.getResultList();
		
		assertEquals("뉴 테스트카0", cars.get(0).getName());
	}
}
