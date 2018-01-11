package racing;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Joeylee on 2018-01-07.
 */
public class RacingGameTest {


    @Test
    public void 자동차가_4이상일때_움직이나() throws Exception {

       RacingGame racingGame = new RacingGame("car1,car2,car3");
       Car car1 = racingGame.getCarList().get(0);
       assertEquals(false,car1.move(3));
       assertEquals(true,car1.move(4));

    }

    @Test
    public void 경기_최대거리_출력() throws Exception {

        RacingGame racingGame = new RacingGame("car1,car2,car3");
        racingGame.racing(3);

    }

    @Test
    public void 경기_최대거리_맞추기() throws Exception {

        RacingGame racingGame = new RacingGame("car1,car2,car3");
        racingGame.getCarList().get(0).move(4);
        racingGame.getCarList().get(0).move(4);
        racingGame.getCarList().get(1).move(4);
        racingGame.getCarList().get(2).move(4);

        assertEquals(2,racingGame.getMaxDistance());
    }

    @Test
    public void 경기_승리자_맞추기() throws Exception {

        RacingGame racingGame = new RacingGame("car1,car2,car3");
        racingGame.getCarList().get(0).move(4);
        int maxDistance = racingGame.getMaxDistance();

        assertEquals("car1",racingGame.getWinner(maxDistance));

    }

}