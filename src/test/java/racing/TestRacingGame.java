package racing;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import racing.speed.Speed;

import java.util.ArrayList;
import java.util.List;

public class TestRacingGame {
    RacingGame racingGame = null;
    Speed speedMock;

    @Before
    public void setUp() throws Exception {
        speedMock = mock(Speed.class);
        when(speedMock.fullAccel()).thenAnswer(new Answer() {
            private int count = 0;

            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                return ((count++) % 2) == 0 ? 3 : 4;
            }
        });

        racingGame = new RacingGame(speedMock);
    }

    @Test
    public void 기본_생성자_테스트() {
        List<Integer> carPositions = new ArrayList();
        carPositions.add(new Integer(1));
        carPositions.add(new Integer(1));
        carPositions.add(new Integer(1));

        assertThat(racingGame.time).isEqualTo(5);
        assertThat(racingGame.carPositions).isEqualTo(carPositions);
    }

    @Test
    public void 차량수_횟수_지정_생성자_테스트() {
        racingGame = new RacingGame(speedMock, 5, 3);

        List<Integer> carPositions = new ArrayList();
        carPositions.add(new Integer(1));
        carPositions.add(new Integer(1));
        carPositions.add(new Integer(1));

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
        racingGame = new RacingGame(speedMock, 3, 2);

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

    @Test
    public void setCarPositionsTest() {
        racingGame = new RacingGame(speedMock);
        assertThat(racingGame.carPositions.size()).isEqualTo(3);

        racingGame.setCarPositions(5);
        assertThat(racingGame.carPositions.size()).isEqualTo(5);

        racingGame = new RacingGame(speedMock, 5, 2);
        assertThat(racingGame.carPositions.size()).isEqualTo(2);
    }

}



