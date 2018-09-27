import car.GameInfo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import view.InputView;

import static junit.framework.TestCase.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

public class GameInfoTest {
    private GameInfo game;

    @Before
    public void setup() {
        game = new GameInfo(InputView.name());
    }

    @Test
    public void checkMove() {
        int n = game.checkMove(5);
        assertThat(n).isEqualTo(1);
    }

    @After
    public void teardrop() {

    }

}
