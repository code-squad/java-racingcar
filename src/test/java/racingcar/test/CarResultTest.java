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
		test1.updatePosition(5);
		test1.updatePosition(5);
		test2 = new Car("test2");
		test3 = new Car("test3");
		car = new Car[] { test1, test2, test3 };
		carResult = new CarResult(car);
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void testPrintResultView() {
		carResult.printResultView();
		assertThat(outContent.toString(), is("실행 결과\r\ntest1 : --\r\ntest2 : \r\ntest3 : \r\n"));
	}

	@Test
	public void testPrintResultBar() {
		carResult.printResultBar(0);
		assertThat(outContent.toString(), is("--\r\n"));
	}

	@Test
	public void testMaxCompare() {
		int max = 0;
		assertThat(carResult.maxCompare(max), is(2));
	}

	@Test
	public void testMaxCompareResult() {
		int max = 2;
		assertThat(car[0].maxPosition(max), is(2));
	}

	@Test
	public void testPrintWinnerCheck() {
		int max = 2;
		carResult.winnerCheck(max);
		assertThat(outContent.toString(), is("test1 "));
	}

	@Test
	public void testPrintWinnerResult() {
		int max = 2;
		carResult.printWinnerResult(0, max);
		assertThat(outContent.toString(), is("test1 "));
	}
}