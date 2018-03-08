package racingcar;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class RacingTest {
	Racing racing;
	String[] carNames = { "pobi", "honux", "crong", "JK" };
	Car[] cars;
	ArrayList<String> winners;
	
	@Before
	public void setUp() {
		racing = new Racing(carNames);
		racing.makeCar(carNames);
		cars = racing.getCars();

		// position 0증가
		cars[0].move(3);
		// position 1증가
		cars[1].move(4);
		// position 2증가
		cars[2].move(4);
		cars[2].move(4);
		cars[3].move(4);
		cars[3].move(4);
		
		winners = racing.rank();
	}

	// 공동 우승자는 pobi, honux. 즉 winners size도 2
	@Test
	public void rank() {
		assertEquals("crong", winners.get(0));
		assertEquals("JK", winners.get(1));
		assertEquals(2, winners.size());
	}

	@Test
	public void compare() {
		int winnerScore = 0;
		for (int i = 0; i < cars.length; i++) {
			winnerScore = racing.compare(winners, winnerScore, i);
		}
		
		assertEquals(2, winnerScore);
	}
}
