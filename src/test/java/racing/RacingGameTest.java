package racing;

import static org.assertj.core.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;
import racing.speed.Speed;
import racing.speed.SpeedImpl;

import java.util.Arrays;
import java.util.List;

public class RacingGameTest {
    RacingGame racingGame = null;
    Speed speedMock;

    @Before
    public void setUp() throws Exception {
        racingGame = new RacingGame(new SpeedImpl() {
            private int count = 0;
            @Override
            public int fullAccel() {
                return ((count++) % 2) == 0 ? 3 : 4;
            }
        });
    }

    @Test
    public void 기본_생성자_테스트() {
        List<Integer> carPositions = Arrays.asList(1, 1, 1);

        assertThat(racingGame.time).isEqualTo(5);
        assertThat(racingGame.carPositions).isEqualTo(carPositions);
    }

    @Test
    public void 차량수_횟수_지정_생성자_테스트() {
        racingGame = new RacingGame(speedMock, 5, 3);

        List<Integer> carPositions = Arrays.asList(1, 1, 1);

        assertThat(racingGame.time).isEqualTo(5);
        assertThat(racingGame.carPositions).isEqualTo(carPositions);
    }

    @Test
    public void canIGo() {
        assertThat(racingGame.canIGo()).isFalse();
        assertThat(racingGame.canIGo()).isTrue();
        assertThat(racingGame.canIGo()).isFalse();
        assertThat(racingGame.canIGo()).isTrue();
        assertThat(racingGame.canIGo()).isFalse();
    }

    @Test
    public void forwardTest() {
        racingGame.forward(0);
        assertThat(racingGame.carPositions.get(0)).isEqualTo(1);

        racingGame.forward(0);
        assertThat(racingGame.carPositions.get(0)).isEqualTo(2);
    }

    @Test
    public void racingTest() {
        racingGame = new RacingGame(new SpeedImpl() {
            private int count = 0;
            @Override
            public int fullAccel() {
                return ((count++) % 2) == 0 ? 3 : 4;
            }
        }, 3, 2);

        racingGame.racing();
        assertThat(racingGame.carPositions.get(0)).isEqualTo(1);
        assertThat(racingGame.carPositions.get(1)).isEqualTo(2);

        racingGame.racing();
        assertThat(racingGame.carPositions.get(0)).isEqualTo(1);
        assertThat(racingGame.carPositions.get(1)).isEqualTo(3);
    }

    @Test
    public void bbangTest() {
        racingGame.bbang();
        assertThat(racingGame.carPositions.get(0)).isEqualTo(3);
        assertThat(racingGame.carPositions.get(1)).isEqualTo(4);
        assertThat(racingGame.carPositions.get(2)).isEqualTo(3);
    }

    @Test
    public void getDistanceTest() {
        assertThat(racingGame.getDistance(1)).isEqualTo("-");
        assertThat(racingGame.getDistance(4)).isEqualTo("----");
    }
}



