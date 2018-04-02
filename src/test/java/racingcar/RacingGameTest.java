package racingcar;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {

    @Test(expected = IllegalArgumentException.class)
    public void 생성자_파라미터_null체크_확인() {
        RacingGameInfoDTO info = null;
        RacingGame racingGame = new RacingGame(info);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 생성자_파라미터_차갯수0체크_확인() {
        RacingGameInfoDTO info = new RacingGameInfoDTO().setCountOfCar(0);
        RacingGame racingGame = new RacingGame(info);
    }

    @Test
    public void 이동_출력() {
        String result = ResultView.printMove(3);
        assertThat(result).isEqualTo("---");
    }

    @Test
    public void 숫자4_미만_이동_불가능_확인() {
        boolean result = RacingGame.isMoving(3);
        assertThat(result).isEqualTo(false);
    }

    @Test
    public void 숫자4_이상_이동_가능_확인() {
        boolean result = RacingGame.isMoving(4);
        assertThat(result).isEqualTo(true);
    }
}
