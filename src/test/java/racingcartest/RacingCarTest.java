package racingcartest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import racingcar.CarsInfo;
import racingcar.InputRacingCarView;
import racingcar.OutputRacingCarView;
import racingcar.Racing;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
    public void 입력_이동_유효값() {
        InputRacingCarView.checkInputMoveValue(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 입력_이름_유효값_null() {
        InputRacingCarView.checkInputCarNamesValue(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 입력_이름_유효값_빈문자열() {
        InputRacingCarView.checkInputCarNamesValue("");
    }

    @Test
    public void 랜덤() {
        CarsInfo carsInfo = CarsInfo.makeRacingCarInfo(new String[]{"testCar1"});
        assertThat(carsInfo.returnRandom()).isBetween(0, 9);
    }

    @Test
    public void 자동차_위치_출력() {
        assertEquals("testCar : ---", OutputRacingCarView.printCarMove("testCar", 3));
    }

    @Test
    public void 우승자_확인() {
        Racing racing = new Racing(new String[]{"testCar1", "testCar2", "testCar3"});
        assertEquals("testCar1, testCar2, testCar3", racing.returnRacingWinningResult());
    }

    @Test(expected = IllegalArgumentException.class)
    public void CarsInfo_생성_null() {
        CarsInfo.makeRacingCarInfo(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void CarsInfo_생성_EmptyString() {
        CarsInfo.makeRacingCarInfo(new String[]{});
    }

}