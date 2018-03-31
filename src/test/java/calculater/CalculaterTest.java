package calculater;

import org.junit.Assert;
import org.junit.Test;

public class CalculaterTest {
	@Test
	public void 덧셈() {
		Assert.assertEquals(0, Double.compare(5, Calculater.calculate("2 + 3")));
	}
	
	@Test
	public void 뺄셈() {
		Assert.assertEquals(0, Double.compare(2, Calculater.calculate("5 - 3")));
	}
	
	@Test
	public void 곱하기() {
		Assert.assertEquals(0, Double.compare(8, Calculater.calculate("2 * 4")));
	}
	
	@Test
	public void 나누기() {
		Assert.assertEquals(0, Double.compare(2, Calculater.calculate("10 / 5")));
	}
	
	@Test
	public void 계산() {
		Assert.assertEquals(0, Double.compare(10, Calculater.calculate("2 + 3 * 4 / 2")));
	}
}
