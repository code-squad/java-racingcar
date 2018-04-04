package racing.player;

import static org.assertj.core.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;
import racing.player.Car;

public class CarTest {

    Car car;

    @Before
    public void setUp() {
        car = new Car("paprika");
    }

    @Test
    public void constructorTest() {
        assertThat(car).isEqualToComparingFieldByField(new Car("paprika"));
    }

    @Test
    public void setPositionTest() {
        car.setPosition(1);
        assertThat(car.position).isEqualTo(1);
        assertThat(car.distance).isEqualTo("-");

        car.setPosition(3);
        assertThat(car.position).isEqualTo(3);
        assertThat(car.distance).isEqualTo("---");
    }
}
