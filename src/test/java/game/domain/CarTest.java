package game.domain;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private Car car;

    @Before
    public void setUp() throws Exception {
        car = new Car(0);
    }

    @Test
    public void move로_한칸만_이동() {
        int oldPosition = car.getPosition();
        car.move(9);
        int actual = car.getPosition();

        assertThat(actual).isEqualTo(++oldPosition);
    }
}