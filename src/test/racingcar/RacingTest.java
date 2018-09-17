import org.junit.Test;
import racingcar.Car;
import racingcar.Racing;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingTest {
    @Test
    public void findWinners() {
        Car[] cars = {new Car("pobi", 3), new Car("honux", 1)};

        ArrayList<Car> winners = Racing.findWinners(cars);

        assertThat(winners.size()).isEqualTo(1);
        assertThat(winners.get(0).getName()).isEqualTo("pobi");
    }

    @Test
    public void generateWinnerText() {
        ArrayList<Car> winners = new ArrayList<>();
        winners.add(new Car("pobi", 3));
        winners.add(new Car("honux", 3));
        winners.add(new Car("b", 3));

        String text = Racing.generateWinnerText(winners);
        assertThat(text).isEqualTo("pobi,honux,b");
    }

    @Test
    public void moveCar() {
        int countMove = Racing.moveCar(5);
        assertThat(countMove).isEqualTo(1);
    }

    @Test
    public void nonMovecar() {
        int countMove = Racing.moveCar(3);
        assertThat(countMove).isEqualTo(0);
    }

    @Test
    public void findHigherScore() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("pobi", 6));
        cars.add(new Car("honux", 2));
        cars.add(new Car("b", 3));

        int max = Racing.findHigherScore(cars);
        assertThat(max).isEqualTo(6);
    }
}
