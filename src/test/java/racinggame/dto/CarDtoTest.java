package racinggame.dto;

import org.junit.Test;
import racinggame.dto.CarDto;

import static org.assertj.core.api.Assertions.assertThat;

public class CarDtoTest {
    @Test
    public void createStatus() {
        CarDto car = new CarDto("pobi", 3);
        assertThat(car.createStatus()).isEqualTo("---");
    }
}
