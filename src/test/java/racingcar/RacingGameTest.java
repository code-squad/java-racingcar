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
        RacingGame racingGame = new RacingGame(Arrays.asList("sangsik", "pobi", "crong"));
        racingGame.start(5);

        Map<Integer, List<UserRecord>> records = racingGame.getGameRecord().loadAll();

        for (Integer key : records.keySet()) {
            System.out.println(key + "회차 : " + records.get(key));
        }

        List<UserRecord> winners = racingGame.getGameRecord().getWinners();
        System.out.println(winners);
    }

    @Test(expected = RuntimeException.class)
    public void 레이스_시작전_결과확인() {
        RacingGame racingGame = new RacingGame(Arrays.asList("sangsik", "pobi", "crong"));
        List<UserRecord> winners = racingGame.getGameRecord().getWinners();
    }
}
