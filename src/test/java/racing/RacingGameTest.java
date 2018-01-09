package racing;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Joeylee on 2018-01-07.
 */
public class RacingGameTest {


    @Test
    public void 자동차가_4이상일때_움직이나() throws Exception {

       RacingGame racingGame = new RacingGame(3, 5);
       Car car1 = racingGame.getCarList().get(0);
       assertEquals(false,car1.move(3));
       assertEquals(true,car1.move(4));

    }

}