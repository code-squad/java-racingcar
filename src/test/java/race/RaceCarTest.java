package race;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RaceCarTest {
    private RaceCar raceCar;
    private String racerName = "Racer1";

    @Before
    public void setUp() {
        raceCar = new RaceCar(racerName);
    }

    @Test
    public void 레이스_룰이_만족될때만_움직인다() {
        //given
        RaceRule alwaysFalseRule = randomValue -> false;

        //when
        raceCar.move(alwaysFalseRule);
        raceCar.move(alwaysFalseRule);
        raceCar.move(alwaysFalseRule);

        //then
        Assert.assertThat(raceCar.getRecorder().getLastRecord(), is(0));
    }
}