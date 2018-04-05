package racingcar.domain;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class CarTest {
	private Car car = new Car("test");
	
	@Before
	public void setUp() {
		Rule rule = new RandomRule();
		car.move(rule);
	}
	
	@Test
	public void isTripMeter테스트() {
		if(car.getTripMeter() == 1) {
			assertEquals(true, car.isTripMeter(1));
			assertEquals(false, car.isTripMeter(0));
		}
	}
}
