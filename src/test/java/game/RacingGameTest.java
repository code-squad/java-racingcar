package game;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {

    /*
    Test Case 목록 구현

    random 값이 4 이상이면 1칸 전진한다.
    random 값이 4 미만이면 전진하지 않는다.
    random 값이 9를 초과하면 전진하지 않는다.
    random 값이 0 미만이면 전진하지 않는다.
    자동차들의 상태를 볼 수 있다.
    */

    private RacingGame racingGame;

    @Before
    public void setUp() {
        final int time = 3;
        final int carCount = 5;

        racingGame = new RacingGame(time, carCount);
    }

    @Test
    public void 자동차_배열_초기화() {
        List<Integer> actual = racingGame.initCarPositions(5);

        assertThat(actual).containsExactly(0, 0, 0, 0, 0);
    }

    @Test
    public void 화면_그리기() {
        assertThat(racingGame.draw()).isEqualTo(String.join("\n"
                , "-"
                , "-"
                , "-"
                , "-"
                , "-\n"));
    }

    @Test
    public void random값이_4_이상이면_1칸_전진한다() {
        final int position = 0;
        final int randomValue = 4;
        List<Integer> actual = racingGame.move(position, randomValue);

        assertThat(actual.get(position)).isEqualTo(1);
    }

    @Test
    public void random값이_4_미만이면_전진하지_않는다() {
        final int position = 0;
        final int randomValue = 3;
        List<Integer> actual = racingGame.move(position, randomValue);

        assertThat(actual.get(position)).isEqualTo(0);
    }

    @Test
    public void random값이_9를_초과하면_전진하지_않는다() {
        final int position = 0;
        final int randomValue = 10;
        List<Integer> actual = racingGame.move(position, randomValue);

        assertThat(actual.get(position)).isEqualTo(0);
    }

    @Test
    public void random값이_0_미만이면_전진하지_않는다() {
        final int position = 0;
        final int randomValue = -1;
        List<Integer> actual = racingGame.move(position, randomValue);

        assertThat(actual.get(position)).isEqualTo(0);
    }
}