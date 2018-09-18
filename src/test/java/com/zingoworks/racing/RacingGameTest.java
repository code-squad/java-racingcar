package com.zingoworks.racing;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {

    @Test
    public void findWinners() {
        String[] carNames = {"a", "b", "c"};
        int tryNo = 0;
        RacingGame racingGame = new RacingGame(carNames);
        racingGame.racing(tryNo);
        assertThat((racingGame.findWinners().size())).isEqualTo(3);
    }
}