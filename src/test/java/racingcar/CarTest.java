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

    @Test
    public void isMaxPos() {
        Car car = new Car("red", 1);
        int max = 4;
        assertThat(car.isMaxPos(max), is(true));
    }

    @Test
    public void findMaxPos(){
        Car car = new Car("red", 6);
        int max = 4;
        assertThat(car.findMaxPos(max), is(4));
    }
}
