package racingcar;

import org.junit.Test;
import racingcar.domain.BasicCar;
import racingcar.domain.Record;
import racingcar.domain.interfaces.Car;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author sangsik.kim
 */
public class BasicCarTest {

    @Test
    public void 기준점수_미만일때_이동() {
        Car car = new BasicCar("sangsik");
        Integer lessThanMoveCriteria = new Random().nextInt(4);

        Record record = car.move(lessThanMoveCriteria);

        assertThat(record.getPosition()).isEqualTo(0);
    }

    @Test
    public void 기준점수_이상일때_이동() {
        Car car = new BasicCar("sangsik");
        Integer overMoveCriteria = new Random().nextInt(4) + 6;

        Record record = car.move(overMoveCriteria);

        assertThat(record.getPosition()).isEqualTo(1);
    }
}
