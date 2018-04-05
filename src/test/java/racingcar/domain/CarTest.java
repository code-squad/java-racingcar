package racingcar.domain;

import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;


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
			assertThat(car.isTripMeter(1)).isEqualTo(true);
			assertThat(car.isTripMeter(0)).isEqualTo(false);
		}
	}
}
