package game.racingGame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RacingTest {
    private Integer TRIAL_TIME = 5;
    private RacingGame racingGame;
    private String[] nameOfCars = {"car1", "car2", "car3"};

    @Before
    public void setUp(){
        racingGame = new RacingGame(nameOfCars, TRIAL_TIME);
    }

    @Test
    public void newGame(){
        racingGame.move();
        racingGame.pickWinners();
        assertEquals(TRIAL_TIME, racingGame.getTrialTime());
        assertEquals(nameOfCars.length, racingGame.getCars().size());
    }
}
