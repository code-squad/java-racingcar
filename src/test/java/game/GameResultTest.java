package game;

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
        histories.add(Arrays.asList(new Car(),
                                    new Car(),
                                    new Car()));

        gameResult = new GameResult(histories);
    }

    @Test
    public void draw_테스트() {
        String actual = gameResult.draw();

        assertThat(actual).isEqualTo("-\n-\n-\n\n");
    }
}