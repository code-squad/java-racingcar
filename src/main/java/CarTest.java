import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CarTest {
	
	Car car;
	
	@Before
	public void setup() {
		car = new Car("will");
	}
	
	@Test
	public void 자동차가앞으로전진 () {
		car.run(5);
		assertEquals(1, car.getPosition());
	}
	
	@Test
	public void 자동차가정지 () {
		car.run(2);
		assertEquals(0, car.getPosition());
	}
	
	@After
	public void tearDown() {
		car = null;
	}


}
