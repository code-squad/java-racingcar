package calculator;

import org.junit.Before;
import org.junit.Test;


public class MainTest {
    private Main main;
    private String input;
    @Before
    public void setUp(){
        main = new Main("2+3/5");
        input = "2+3/5";
    }


    @Test
    public void isValidatedTest(){
        //assertThat(main.isValidated(3,2)).isTrue();
    }
}
