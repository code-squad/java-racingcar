<<<<<<< HEAD
import car.GameInfo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import view.InputView;
=======
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
>>>>>>> daesoop

import static junit.framework.TestCase.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

public class GameInfoTest {
    private GameInfo game;
<<<<<<< HEAD

    @Before
    public void setup() {
        game = new GameInfo(InputView.name());
    }

=======
    @Before
    public void setup() {
        game = new GameInfo();
    }
>>>>>>> daesoop
    @Test
    public void checkMove() {
        int n = game.checkMove(5);
        assertThat(n).isEqualTo(1);
    }
<<<<<<< HEAD

=======
>>>>>>> daesoop
    @Test
    public void checkMove1() {
        int n = game.checkMove(3);
        assertThat(n).isEqualTo(0);
    }

    @After
    public void teardrop() {

    }

}
