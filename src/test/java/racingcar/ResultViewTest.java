package racingcar;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ResultViewTest {
    Car[] cars = {new Car("pobi", 3), new Car("peter", 1), new Car("lime", 2)};

    @Test
    public void winUser() {
        int max = ResultView.getMax(cars);
        assertThat(max).isEqualTo(3);
        assertThat(cars[2].getUserName()).isEqualTo("pobi");
    }

    @Test
    public void winUsers(){
        ResultView.winUser(cars);
        assertThat(ResultView.winName).isEqualTo("pobi ");
    }

}
