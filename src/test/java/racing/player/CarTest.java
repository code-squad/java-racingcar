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
        assertThat(car).isEqualToComparingFieldByField(new Car("paprika", 0));
    }

    @Test
    public void moveTest() {
        Car garlic = new Car("garlic", 2);
        garlic.move(4);
        assertThat(garlic.position).isEqualTo(3);

        garlic.move(3);
        assertThat(garlic.position).isEqualTo(3);

        garlic.move(7);
        assertThat(garlic.position).isEqualTo(4);
    }
}
