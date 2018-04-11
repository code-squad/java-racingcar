package racingcar;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertArrayEquals;


public class RacingGameTest {

    @Test
    public void 테스트_RacingGameApp_splitNames() {
        assertThat(RacingGameApp.splitNames("pobi,crong,honux")).contains("pobi");
        assertThat(RacingGameApp.splitNames("pobi,crong,honux")).contains("crong");
        assertThat(RacingGameApp.splitNames("pobi,crong,honux")).contains("honux");

    }

    @Test
    public void 테스트_RacingGame_getRaceTopPosition() {
        RacingGame racingGame = new RacingGame(RacingGameApp.splitNames("pobi,crong,honux"));
        assertThat(racingGame.getRaceTopPosition()).isEqualTo(0);
    }

    @Test
    public void 테스트_RacingGame_getWinnersRacing() {
        RacingGame racingGame = new RacingGame(RacingGameApp.splitNames("pobi,crong,honux"));
        assertThat(racingGame.getWinnnersRacing()).contains("pobi");
        assertThat(racingGame.getWinnnersRacing()).contains("crong");
        assertThat(racingGame.getWinnnersRacing()).contains("honux");
    }

    @Test
    public void 테스트_Car_addPosition() {
        Car car = new Car("test");

        car.addPosition(3);
        assertThat(car.getPosition()).isEqualTo(0);

        car.addPosition(4);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    public void 테스트_Car_getTopPosition() {
        Car car = new Car("test");

        assertThat(car.getTopPosition(0)).isEqualTo(0);
        assertThat(car.getTopPosition(1)).isEqualTo(1);

        car.addPosition(4); // position 1 전진

        assertThat(car.getTopPosition(0)).isEqualTo(1);
        assertThat(car.getTopPosition(2)).isEqualTo(2);

    }

    @Test
    public void 테스트_Car_isMatchPosition() {
        Car car = new Car("test");

        assertThat(car.isMatchPosition(0)).isEqualTo(true);
        assertThat(car.isMatchPosition(1)).isEqualTo(false);

        car.addPosition(4); // position 1 전진

        assertThat(car.isMatchPosition(0)).isEqualTo(false);
        assertThat(car.isMatchPosition(1)).isEqualTo(true);
    }
}
