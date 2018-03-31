package calculater;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculaterTest {
	private static final double DELTA = 1e-15;
	
	@Test
	public void 덧셈() {
		assertEquals(5,Calculater.calculate("2 + 3"), DELTA);
	}
	
	@Test
	public void 뺄셈() {
		assertEquals(2, Calculater.calculate("5 - 3"), DELTA);
	}
	
	@Test
	public void 곱하기() {
		assertEquals(8, Calculater.calculate("2 * 4"), DELTA);
	}
	
	@Test
	public void 나누기() {
		assertEquals(2, Calculater.calculate("10 / 5"), DELTA);
	}
}
