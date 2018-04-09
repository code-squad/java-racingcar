package racingcar.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameResultTest {

    List<Car> cars = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        cars.add(new Car("pobi"));
        cars.add(new Car("crong"));
        cars.add(new Car("honux"));

        cars.get(0).move(5);
    }

    @Test
    public void 게임승자뽑기() {
        GameResult gameResult = new GameResult(this.cars);
        assertThat(gameResult.getWinnerNames().toString()).isEqualTo("pobi");
    }

    @Test
    public void 게임승자복수뽑기() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("pobi"));
        cars.add(new Car("crong"));
        cars.add(new Car("honux"));

        cars.get(0).move(6);
        cars.get(1).move(7);

        GameResult gameResult = new GameResult(cars);

        assertThat(gameResult.getWinnerNames().toString()).isEqualTo("pobi, crong");
    }
}
