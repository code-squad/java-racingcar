package racingcartest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import racingcar.InputRacingCarView;
import racingcar.OutputRacingCarView;
import racingcar.RacingCar;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class RacingCarTest {

    private final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

    @Before
    public void setup() {
        System.setOut(new PrintStream(byteArrayOutputStream));
    }

    @After
    public void restore() {
        System.setOut(System.out);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 입력_유효값() {
        InputRacingCarView.checkInputValue(-1);
    }

    @Test
    public void 랜덤() {
        RacingCar racingCar = new RacingCar(1);
        assertThat(racingCar.returnRandom()).isBetween(0, 9);
    }

    @Test
    public void 자동차_위치_출력() {
        OutputRacingCarView.printCarMove(3);
        assertEquals("---", byteArrayOutputStream.toString());
    }

}