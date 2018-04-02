package game;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ViewTest {

    private View view;

    @Before
    public void setUp() throws Exception {
        view = View.newInstance();
    }


    @Test
    public void 화면_그리기() {
        List<Car> actual = Arrays.asList(Car.newInstance(),
                                         Car.newInstance(),
                                         Car.newInstance(),
                                         Car.newInstance(),
                                         Car.newInstance());
        assertThat(view.draw(actual)).isEqualTo(String.join("\n"
                , "-"
                , "-"
                , "-"
                , "-"
                , "-\n"));
    }
}