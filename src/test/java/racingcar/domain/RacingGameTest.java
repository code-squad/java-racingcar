package racingcar.domain;

import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {

    @Test
    public void 객체_생성() {
        RacingGame rg = new RacingGame();
        String[] a = {"a", "b", "c"};
        ArrayList<Car> b = new ArrayList<>();
        b = rg.carInstuns(a);
        assertThat(b).hasSize(3);
    }
}
