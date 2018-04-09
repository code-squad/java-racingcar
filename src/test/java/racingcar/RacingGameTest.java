package racingcar;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertArrayEquals;


public class RacingGameTest {

    @Test
    public void 테스트_addPosition(){
        RacingGame racingGame = new TestRacingGame(3);
        assertThat(racingGame.addPosition(3)).isEqualTo(4);
        assertThat(racingGame.addPosition(4)).isEqualTo(5);
    }

    @Test
    public void 테스트_move(){
        RacingGame racingGame = new TestRacingGame(3);
        assertArrayEquals(racingGame.move(),new int[]{1,1,1});
        assertArrayEquals(racingGame.move(),new int[]{2,2,2});
    }

}
