package racingcartest;

import org.junit.Before;
import org.junit.Test;
import racingcar.RacingCar;

public class RacingCarTest {

    @Test(expected = IllegalArgumentException.class)
    public void  차_대수(){
        RacingCar.racing(0,5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void  차_이동_횟수(){
        RacingCar.racing(5,-1);
    }

}
