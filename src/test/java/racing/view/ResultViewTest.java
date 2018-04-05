package racing.view;

import org.junit.Test;
import racing.player.Car;
import racing.views.ResultView;

import static org.assertj.core.api.Assertions.*;

public class ResultViewTest {

    @Test
    public void getDistanceTest() {
        Car garlic = new Car("garlic", 10);
        assertThat(ResultView.getDistance(garlic)).isEqualTo("----------");

        garlic = new Car("garlic");
        assertThat(ResultView.getDistance(garlic)).isEqualTo("");
    }
}
