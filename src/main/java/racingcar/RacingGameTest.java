package racingcar;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class RacingGameTest {
	RacingGame racing;
	Car pobiCar, learnerCar, sangkoCar;

	@Before
	public void setUp() throws Exception {
		// pobi - 15, learner - 5, sangko - 5
		Car[] cars = { new Car("pobi", 15), new Car("learner", 5), new Car("sangko", 5) };
		racing = new RacingGame(cars);
		racing.rank();
	}

	// 최고 값을 찾는 메서드는 findWinners().
	@Test
	public void getWinnerScore() {
		int winnerScore = 0;

		for (Car car : racing.getCars()) {
			winnerScore = racing.findWinners(car, winnerScore);
		}
		assertEquals(15, winnerScore);
	}

	@Test
	public void getWinnerNames() {
		// 계속 winners의 bounds가 0으로 나왔는데, rank()를 하지 않아서 생긴 문제.
		// rank()를 하게 되면 우승자 목록에 우승자가 들어가게 되므로, bounds가 1이상이 된다.
		ArrayList<String> winners = racing.getWinners();
		assertEquals("pobi", winners.get(0));
	}
}