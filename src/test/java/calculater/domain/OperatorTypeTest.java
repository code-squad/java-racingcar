package calculater.domain;

import org.junit.Assert;
import org.junit.Test;

public class OperatorTypeTest {
	@Test
	public void getOperatorSymbol_String반환_확인하기() {
		Assert.assertEquals(true, OperatorType.PLUS.getOperatorSymbol() instanceof String);
	}
	
	@Test
	public void findBySymbol_덧셈OperatorType_얻기() {
		Assert.assertEquals(OperatorType.PLUS, OperatorType.findBySymbol("+"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void findBySymbol_Exception발생_확인하기() {
		OperatorType.findBySymbol(")");
	}
}
