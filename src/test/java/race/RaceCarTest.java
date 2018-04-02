package race;

import org.assertj.core.api.Assertions;
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
    public void 레이스_룰이_만족하지_않으면_움직이지_않는다() {
        //given
        RaceRule alwaysFalseRule = randomValue -> false;

        //when
        raceCar.move(alwaysFalseRule);
        Recorder recorder = raceCar.getRecorder();

        //then
        Assertions.assertThat(recorder.getLastRecord()).isZero();
    }
}