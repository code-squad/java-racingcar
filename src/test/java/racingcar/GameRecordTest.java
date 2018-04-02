package racingcar;

import org.junit.Test;
import racingcar.interfaces.Car;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author sangsik.kim
 */
public class GameRecordTest {

    @Test
    public void 기록_저장_불러오기() {
        GameRecord gameRecord = new GameRecord();

        Car car1 = new BasicCar("sangsik");
        Car car2 = new BasicCar("pobi");
        Car car3 = new BasicCar("crong");

        UserRecord userRecord1 = new UserRecord(car1);
        UserRecord userRecord2 = new UserRecord(car2);
        UserRecord userRecord3 = new UserRecord(car3);

        gameRecord.save(1, Arrays.asList(userRecord1, userRecord2, userRecord3));

        assertThat(gameRecord.load(1)).isEqualTo(Arrays.asList(userRecord1, userRecord2, userRecord3));
    }
}
