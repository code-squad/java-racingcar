package racingcar.test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import racingcar.*;

public class CarResultTest {

	private Car[] car = null;
	private Car test1;
	private Car test2;
	private Car test3;
	private CarResult carResult;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUp() {
		test1 = new Car("test1");
		test1.updatePosition();
		test1.updatePosition();
		test2 = new Car("test2");
		test3 = new Car("test3");
		car = new Car[] { test1, test2, test3 };
		carResult = new CarResult(car);
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void testResultView() {
		carResult.resultView(car.length);
		assertThat(outContent.toString(), is("실행 결과\r\ntest1 : --\r\ntest2 : \r\ntest3 : \r\n"));
	}

	@Test
	public void testResultBar() {
		carResult.resultBar(0);
		assertThat(outContent.toString(), is("--\r\n"));
	}

	@Test
	public void testMaxCompare() {
		int max = 0;
		assertThat(carResult.maxCompare(car.length, max), is(2));
	}

	// 자동차 목록의 위치 값이 가장 큰 값을 찾는 메소드에 대한 테스트 코드를 추가한다.
	@Test
	public void testMaxCompareResult() {
		int max = 2;
		assertThat(carResult.maxCompareResult(max, 0), is(2));
	}

	@Test
	public void testWinnerCheck() {
		// 자동차 목록에서 가장 큰 위치 값에 해당하는 자동차 목록을 구하는 메소드에 대한 테스트 코드를 추가한다.
		int max = 2;
		carResult.winnerCheck(car.length, max);
		assertThat(outContent.toString(), is("test1 "));
	}

	@Test
	public void testWinnerResult() {
		int max = 2;
		carResult.winnerResult(0, max);
		assertThat(outContent.toString(), is("test1 "));
	}

}