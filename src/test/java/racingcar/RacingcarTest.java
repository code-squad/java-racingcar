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
        int[] carPosition = {0 ,0};
        Racingcar.moveCar(carPosition,1);
        Racingcar.moveCar(carPosition,0);
        assertThat(carPosition[0]).isEqualTo(1);
        assertThat(carPosition[1]).isEqualTo(1);
    }

    @Test
    public void 자동차선택해서움직여보기() {
        int[] carPosition = {0,0,0};
        Racingcar.choiceMovingCar(carPosition);
        for(int j:carPosition){
            System.out.println(j);
        }
    }

    @Test
    public void 전체자동차레이싱테스트() {
        int[] carPostion = {0,0,0};
        int time = 5;
        Racingcar.carRacingStart(carPostion,time,new RacingCarView());
    }
}