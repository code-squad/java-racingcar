package racingcar;

import org.junit.Before;
import org.junit.Test;
import racingcar.domain.Car;
import racingcar.domain.GameResult;
import racingcar.domain.RacingGame;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class RacingcarTest {

    List<Car> carList = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        carList.add(new Car("pobi"));
        carList.add(new Car("crong"));
        carList.add(new Car("honux"));
    }

    @Test
    public void 랜덤숫자동작확인() {
        RacingGame racingGame = new RacingGame(this.carList);
        boolean isGetRandomNum = racingGame.isGetMoreThanFiveNum();
        System.out.println(isGetRandomNum);
    }

    @Test
    public void 자동차움직이기() {
        RacingGame racingGame = new RacingGame(this.carList);
        racingGame.moveCar(1);
        racingGame.moveCar(1);
        racingGame.moveCar(0);
        List<Car> carList = racingGame.getCarPosition();
        assertThat(carList.get(0).getCarPostion()).isEqualTo(1);
        assertThat(carList.get(1).getCarPostion()).isEqualTo(2);
    }

    @Test
    public void 자동차선택해서움직여보기() {
        RacingGame racingGame = new RacingGame(this.carList);
        GameResult result = racingGame.choiceMovingCar();
        assertThat(result).isNotNull();
    }

    @Test
    public void 룰넘버확인하기() {
        assertThat(RacingGame.getRulenum()).isEqualTo(4);
    }
}