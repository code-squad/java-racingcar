package game.domain;

import game.domain.GameRule;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameRuleTest {

    @Test
    public void random값이_4_이상이면_true() {
        assertThat(GameRule.canMove(4)).isTrue();
    }

    @Test
    public void random값이_4_미만이면_false() {
        assertThat(GameRule.canMove(3)).isFalse();
    }

    @Test
    public void random값이_9를_초과하면_false() {
        assertThat(GameRule.canMove(10)).isFalse();
    }

    @Test
    public void random값이_0_미만이면_false() {
        assertThat(GameRule.canMove(-1)).isFalse();
    }
}