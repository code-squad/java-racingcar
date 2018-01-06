package racing;

import org.junit.Test;
import racing.game.RacingGame;

import static org.junit.Assert.*;

/**
 * Created by Moonchan on 2018. 1. 6..
 */
public class RacingGameTest {

    @Test
    public void startGame() throws Exception {
        RacingGame racingGame = new RacingGame();
        racingGame.startGame();
    }

}