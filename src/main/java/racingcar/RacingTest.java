package racingcar;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class RacingTest {
	String[] carNames = { "pobi", "honux", "crong", "JK" };
	Racing racing = new Racing(carNames);
	Car[] cars;
	ArrayList<String> winners = new ArrayList<String>();

	@Before
	public void setUp() {
		racing.makeCar(carNames);
		cars = racing.getCars();
		autoInputData();
	}

	public void autoInputData() {
		cars[0].move(3); // position 0증가
		cars[1].move(4); // position 1증가

		// position 2증가
		for (int i = 2; i < 4; i++) {
			cars[i].move(4);
			cars[i].move(4);
		}
	}

	
	/*
	 *  problem
	 *  compare() 테스트에서 winners에 NullPointerException 에러가 난다.
	 *  우승자 목록인 ArrayList<String> winners의 초기화를 rank()함수의 리턴값으로 하기 때문에.
	 *  원래 소스에서는 내가 정한 흐름대로 실행.
	 *  그러나 JUit Test 특성상 테스트 메서드는, 어떤 메서드가 먼저 호출될 지 모른다.
	 *  따라서 작성되는 모든 테스트 메서드는 다른 메서드에 종속되어 있으면 테스트에 실패할 수 있다.
	 *  solution
	 *  RacingTest의 멤버 변수로 빼고, 변수 선언과 동시에 new를 통하여 초기화만 진행한다.
	 *  이전에는 별도의 초기화 없이, 완성된 winners를 가지고 초기화없이 값 세팅을 하려고 했다.  
	 */
	// 마지막으로 저장된 winnerScore가 최고득점자의 점수.
	@Test
	public void compare() {
		int winnerScore = 0;
		for (int i = 0; i < cars.length; i++) {
			winnerScore = racing.compare(winners, winnerScore, i);
		}
		assertEquals(2, winnerScore);
	}

	// 공동 우승자는 pobi, honux. 즉 winners size도 2
	@Test
	public void rank() {
		winners = racing.rank();
		assertEquals("crong", winners.get(0));
		assertEquals("JK", winners.get(1));
		assertEquals(2, winners.size());
	}
}
