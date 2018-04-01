package racingcar;

import org.junit.Test;
import racingcar.interfaces.Car;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author sangsik.kim
 */
public class RacingGameTest {

    @Test
    public void 레이스_실행_기록확인() {
        List<Car> cars = Arrays.asList(new BasicCar(), new BasicCar(), new BasicCar());

        RacingGame racingGame = new RacingGame(cars);
        racingGame.start(5);

        Map<Integer, List<Integer>> records = racingGame.getGameRecord().loadAll();

        for (Integer key : records.keySet()) {
            System.out.println(key + "회차 : " + records.get(key));
        }
    }
}
