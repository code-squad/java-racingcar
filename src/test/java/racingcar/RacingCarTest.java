package racingcar;

import org.junit.Test;

public class RacingCarTest {

    @Test(expected = IllegalArgumentException.class)
    public void isValidParameterCarCountNull() {
        RacingCar racingCar = new RacingCar();
        racingCar.isValidParameter("", "5");
    }

    @Test(expected = IllegalArgumentException.class)
    public void isValidParameterCarCountNonPositive() {
        RacingCar racingCar = new RacingCar();
        racingCar.isValidParameter("-1", "5");
    }

    @Test(expected = IllegalArgumentException.class)
    public void isValidParameterRoundCountNull() {
        RacingCar racingCar = new RacingCar();
        racingCar.isValidParameter("-1", "5");
    }

    @Test(expected = IllegalArgumentException.class)
    public void isValidParameterRoundCountNonPositive() {
        RacingCar racingCar = new RacingCar();
        racingCar.isValidParameter("-1", "5");
    }

}
