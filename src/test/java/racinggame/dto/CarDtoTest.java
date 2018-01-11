package racinggame.dto;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class CarDtoTest {
    @Test
    public void createStatus() {
        CarDto car = new CarDto("pobi", 3);
        assertThat(car.createStatus()).isEqualTo("---");
    }
}
