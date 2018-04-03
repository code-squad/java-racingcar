package racing;

import static org.assertj.core.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class RacingGameTest {
    RacingGame racingGame = null;

    @Before
    public void setUp() {
        racingGame = new RacingGame(3);
    }

    @Test
    public void constructorTest() {
        List<Integer> carPositions = Arrays.asList(1, 1, 1);
        assertThat(racingGame.carPositions).isEqualTo(carPositions);
    }

    // 테스트시 테스트용 고정 데이터를 반환하는 테스트용 fullAccel로 치환후 테스트
    @Test
    public void moveTest() {
        racingGame.move();
        List<Integer> carPositions = Arrays.asList(1, 2, 1);
        assertThat(racingGame.carPositions).isEqualTo(carPositions);

        racingGame.move();
        carPositions = Arrays.asList(1, 3, 2);
        assertThat(racingGame.carPositions).isEqualTo(carPositions);

        racingGame.move();
        carPositions = Arrays.asList(2, 4, 2);
        assertThat(racingGame.carPositions).isEqualTo(carPositions);
    }
}



