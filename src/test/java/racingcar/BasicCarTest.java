package racingcar;

import org.junit.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author sangsik.kim
 */
public class BasicCarTest {

    @Test
    public void 기준점수_미만일때_이동() {
        racingcar.interfaces.Car car = new BasicCar();
        Integer lessThanMoveCriteria = new Random().nextInt(4);

        car.move(() -> lessThanMoveCriteria);

        assertThat(car.getCurrentPosition()).isEqualTo(0);
    }

    @Test
    public void 기준점수_이상일때_이동() {
        racingcar.interfaces.Car car = new BasicCar();
        Integer overMoveCriteria = new Random().nextInt(4) + 6;

        car.move(() -> overMoveCriteria);

        assertThat(car.getCurrentPosition()).isEqualTo(1);
    }
}
