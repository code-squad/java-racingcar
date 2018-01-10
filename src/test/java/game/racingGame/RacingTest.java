package game.racingGame;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RacingTest {
    private Integer TRIAL_TIME = 5;

    @Test
    public void newGame(){
        String[] nameOfCars = {"car1", "car2", "car3"};

        RacingGame racingGame = new RacingGame(nameOfCars, TRIAL_TIME);
        racingGame.move();
        View.getResult(racingGame);

        assertEquals(TRIAL_TIME, racingGame.getTrialTime());
        assertEquals(nameOfCars.length, racingGame.getCars().size());
    }
}
