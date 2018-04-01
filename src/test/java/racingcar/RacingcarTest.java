package racingcar;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class RacingcarTest {

    @Test
    public void 랜덤숫자동작확인() {
        boolean isGetRandomNum = Racingcar.isGetMoreThanFiveNum();
        System.out.println(isGetRandomNum);

    }

    @Test
    public void 자동차움직이기() {
        StringBuilder carRoute = new StringBuilder();
        Racingcar.moveCar(carRoute);
        assertThat(carRoute.toString()).isEqualTo("-");
    }

    @Test
    public void 자동차초기화확인해보기() {
        StringBuilder[] carRoute = null;
        int carNum = 3;
        carRoute = Racingcar.initialCarRoute(carRoute,carNum);
        assertThat(carRoute.length).isEqualTo(3);
    }

    @Test
    public void 자동차레이싱결과확인해보기() {
        StringBuilder[] carRoute = null;
        int carNum = 3;
        int carRacingTry = 2;

        carRoute = Racingcar.initialCarRoute(carRoute,3);
        Racingcar.carRacingStart(carRoute,carNum,carRacingTry);
    }
}