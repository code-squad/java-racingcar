package racingcar.domain;

import org.junit.Before;
import org.junit.Test;
import racingcar.domain.Car;
import racingcar.dto.CarDto;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CarTest {
    public Car car;

    @Before
    public void setUp() {
        car = Car.ofName("pobi");
    }

    @Test
    public void moveStay() {
        car.movePosition(3);
        assertThat(car.CarDto()).isEqualTo(CarDto.ofNameAndPosition("pobi",0));
    }

    @Test
    public void moveForward() {
        car.movePosition(4);
        assertThat(car.CarDto()).isEqualTo(CarDto.ofNameAndPosition("pobi",1));
    }
}
