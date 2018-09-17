package racingcar;

import static racingcar.InputView.*;
import static racingcar.ResultView.*;

public class RacingGameMain {
    public static void main(String[] args) {
        RacingCar rc = new RacingCar();

        rc.makeCar(inputName());                //자동차 생성 및 이름 설정
        rc.run(getTryNum());                    //시도 회수 받아 경주시작
        printScore(rc.cars);                    //이동 점수(거리) 출력
        printWinner(rc.findWinners());          //우승자 출력
    }
}
