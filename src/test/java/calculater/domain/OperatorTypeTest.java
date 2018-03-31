package calculater.domain;

import org.junit.Assert;
import org.junit.Test;

public class OperatorTypeTest {
	@Test
	public void getOperatorSymbol메서드가_String을_제대로_반환하는지_테스트() {
		Assert.assertEquals(true, OperatorType.PLUS.getOperatorSymbol() instanceof String);
	}
	
	@Test
	public void findBySymbol메서드로_덧셈OperatorType얻기() {
		Assert.assertEquals(OperatorType.PLUS, OperatorType.findBySymbol("+"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void findBySymbol메서드에_잘못된_symbol입력하면_Exception발생하는지_테스트() {
		OperatorType.findBySymbol(")");
	}
}
