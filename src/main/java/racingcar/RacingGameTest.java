package racingcar;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RacingGameTest {
	RacingGame racing;
	Car[] cars;

	@Before
	public void setUp() throws Exception {
		String[] carNames = { "pobi", "learner", "sangko", "jimmy" };
		racing = new RacingGame(carNames);
		cars = racing.makeCars(carNames);
		setCarPositionData();
	}

	public void setCarPositionData() {
		for (int i = 0; i < 10; i++) {
			cars[0].move(4);
		}

		for (int i = 1; i < 4; i++) {
			cars[i].move(4);
		}
	}

	// 최고 값을 찾는 메서드는 findWinners().
	@Test
	public void getWinnerScore() {
		int winnerScore = 0;
		
		for (Car car : cars) {
			winnerScore = racing.findWinners(car, winnerScore);
		}
		assertEquals(10, winnerScore);
	}
	
	@Test
	public void getWinnerNames() {
		// 다른 테스트 메서드를 호출해도 괜찮은가?
		getWinnerScore();
		assertEquals("pobi", racing.getWinners().get(0));
	}

}
