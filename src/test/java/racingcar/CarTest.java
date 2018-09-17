package racingcar;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CarTest {

    @Test
    public void run() {
        Car car = new Car("pobi");
        car.run();
        assertThat(car.getPosition(), is(1));
    }
}
