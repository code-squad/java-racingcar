package game;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ViewTest {

    private InputView view;

    @Before
    public void setUp() throws Exception {
        view = new InputView();
    }


    @Test
    public void 화면_그리기() {
        List<Car> actual = Arrays.asList(new Car(),
                                         new Car(),
                                         new Car(),
                                         new Car(),
                                         new Car());
/*
        assertThat(view.draw(actual)).isEqualTo(String.join("\n"
                , "-"
                , "-"
                , "-"
                , "-"
                , "-\n"));*/
    }
}