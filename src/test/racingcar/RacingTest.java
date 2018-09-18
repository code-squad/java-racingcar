import org.junit.Test;
import racingcar.Car;
import racingcar.RacingGame;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingTest {
    @Test
    public void findWinners() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("pobi", 3));
        cars.add(new Car("honux", 1));

        ArrayList<Car> winners = RacingGame.findWinners(cars);

        assertThat(winners.size()).isEqualTo(1);
        assertThat(winners.get(0).getName()).isEqualTo("pobi");
    }

    @Test
    public void generateWinnerText() {
        ArrayList<Car> winners = new ArrayList<>();
        winners.add(new Car("pobi", 3));
        winners.add(new Car("honux", 3));
        winners.add(new Car("b", 3));

        String text = RacingGame.generateWinnerText(winners);
        assertThat(text).isEqualTo("pobi,honux,b");
    }

    @Test
    public void getMaxPosition() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("pobi", 6));
        cars.add(new Car("honux", 2));
        cars.add(new Car("b", 3));

        int max = RacingGame.getMaxPosition(cars);
        assertThat(max).isEqualTo(6);
    }
}
