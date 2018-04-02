package racingcar.view;

import org.junit.Assert;
import org.junit.Test;
import racingcar.domain.Car;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class OutputViewTest {
	@Test
	public void showRoundOutputView테스트() {
		List<Car> cars = new ArrayList<>();
		cars.add(new Car(3));
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		OutputView.showRoundOutputView(3, cars);
		Assert.assertEquals("Round 3\r\n|---\r\n\r\n", out.toString());
	}
}
