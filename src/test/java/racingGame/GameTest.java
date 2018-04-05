package racingGame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    @Before
    public void setUp() {
    }

    @Test
    public void 차목록얻기() {
        String carNames = "choi,in,hyuck";
        ArrayList<Car> cars = Game.getCars(carNames);
        assertThat(cars.get(0).equals(new Car("choi"))
                && cars.get(1).equals(new Car("in"))
                && cars.get(2).equals(new Car("hyuck"))).isTrue();
    }

    @After
    public void tearDown() {
    }
}
