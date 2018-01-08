package game.racingGame;

import org.junit.Test;

public class RacingTest {

    RacingGame racingGame;

    @Test
    public void newGame(){
        racingGame = new RacingGame(3, 5);
        racingGame.move();
        View.getResult(racingGame.getCars());
    }
}
