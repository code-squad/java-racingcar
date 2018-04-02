package game;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameRuleTest {

    private GameRule gameRule;

    @Before
    public void setUp() throws Exception {
        gameRule = new GameRule();
    }

    @Test
    public void random값이_4_이상이면_true() {
        assertThat(gameRule.canMove(4)).isTrue();
    }

    @Test
    public void random값이_4_미만이면_false() {
        assertThat(gameRule.canMove(3)).isFalse();
    }

    @Test
    public void random값이_9를_초과하면_false() {
        assertThat(gameRule.canMove(10)).isFalse();
    }

    @Test
    public void random값이_0_미만이면_false() {
        assertThat(gameRule.canMove(-1)).isFalse();
    }
}