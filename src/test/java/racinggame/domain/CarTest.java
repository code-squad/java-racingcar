package racinggame.domain;

import org.junit.Before;
import org.junit.Test;
import racinggame.dto.CarDto;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    private Car car;

    @Before
    public void setUp() throws Exception {
        car = new Car("javajigi");
    }

    @Test
    public void move_stay() {
        car.move(3);
        assertThat(car.toCarDto()).isEqualTo(new CarDto("javajigi", 0));
    }

    @Test
    public void move_forward() {
        car.move(4);
        assertThat(car.toCarDto()).isEqualTo(new CarDto("javajigi", 1));
    }
}