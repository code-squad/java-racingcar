package game.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameResultTest {

    private GameResult gameResult;

    @Before
    public void setUp() throws Exception {
        List<List<Car>> histories = new ArrayList<>();
        histories.add(Arrays.asList(new Car(0),
                                    new Car(0),
                                    new Car(0)));

        gameResult = new GameResult(histories);
    }

    @Test
    public void draw_테스트() {
        String actual = gameResult.draw();

        assertThat(actual).isEqualTo(Car.DEFAULT_NAME + " : -\n" +
                                     Car.DEFAULT_NAME + " : -\n" +
                                     Car.DEFAULT_NAME + " : -\n\n");
    }

    @Test
    public void winner_테스트() {
        // given
        int winnerPosition = 2;
        List<List<Car>> histories = new ArrayList<>();
        histories.add(Arrays.asList(new Car(winnerPosition),
                                    new Car(1),
                                    new Car(1)));

        gameResult = new GameResult(histories);

        // when
        List<Car> actual = gameResult.winner();

        // then
        List<Car> expected = Arrays.asList(new Car(winnerPosition));
        assertThat(actual).containsAll(expected);
    }

    @Test
    public void 우승자_2명() {
        // given
        int winnerPosition = 2;
        List<List<Car>> histories = new ArrayList<>();
        histories.add(Arrays.asList(new Car(winnerPosition),
                                    new Car(winnerPosition),
                                    new Car(1)));

        gameResult = new GameResult(histories);

        // when
        List<Car> actual = gameResult.winner();

        // then
        List<Car> expected = Arrays.asList(new Car(winnerPosition),
                                           new Car(winnerPosition));
        assertThat(actual).containsAll(expected);
    }
}