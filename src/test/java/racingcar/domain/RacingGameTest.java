package racingcar.domain;

import org.junit.Before;
import org.junit.Test;
import racingcar.domain.Car;
import racingcar.domain.GameResult;
import racingcar.domain.RacingGame;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class RacingGameTest {

    List<Car> cars = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        cars.add(new Car("pobi"));
        cars.add(new Car("crong"));
        cars.add(new Car("honux"));
    }

    @Test
    public void 자동차선택해서움직여보기() {
        RacingGame racingGame = new RacingGame(this.cars);
        GameResult result = racingGame.choiceMovingCar();
        assertThat(result).isNotNull();
    }

}