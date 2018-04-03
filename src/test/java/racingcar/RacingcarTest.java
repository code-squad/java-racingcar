package racingcar;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class RacingcarTest {

    @Test
    public void 랜덤숫자동작확인() {
        RacingGame racingGame = new RacingGame(3);
        boolean isGetRandomNum = racingGame.isGetMoreThanFiveNum();
        System.out.println(isGetRandomNum);
    }

    @Test
    public void 자동차움직이기() {
        RacingGame racingGame = new RacingGame(2);
        racingGame.moveCar(1);
        racingGame.moveCar(0);
        int[] tempCarPostion = racingGame.getCarPosition();
        assertThat(tempCarPostion[0]).isEqualTo(1);
        assertThat(tempCarPostion[1]).isEqualTo(1);
    }

    @Test
    public void 자동차선택해서움직여보기() {
        RacingGame racingGame = new RacingGame(3);
        GameResult result = racingGame.choiceMovingCar();
        assertThat(result).isNotNull();
    }
}