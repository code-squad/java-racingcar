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
    public void 테스트_RacingGame_comparePostion() {
        RacingGame racingGame = new RacingGame(RacingGameApp.splitNames("pobi,crong,honux"));
        assertThat(racingGame.comparetPosition(3,2)).isEqualTo(3);
        assertThat(racingGame.comparetPosition(2,4)).isEqualTo(4);


    }

    @Test
    public void 테스트_RacingGame_getTopPostion() {
        RacingGame racingGame = new RacingGame(RacingGameApp.splitNames("pobi,crong,honux"));
        assertThat(racingGame.getTopPosition()).isEqualTo(0);
    }

    @Test
    public void 테스트_RacingGame_getWinnersRacing() {
        RacingGame racingGame = new RacingGame(RacingGameApp.splitNames("pobi,crong,honux"));
        assertThat(racingGame.getWinnnersRacing()).contains("pobi");
        assertThat(racingGame.getWinnnersRacing()).contains("crong");
        assertThat(racingGame.getWinnnersRacing()).contains("honux");
    }
}
