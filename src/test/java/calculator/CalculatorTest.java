package calculator;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void nothing() throws Exception{

    }


    @Test
    public void 스트링더하기()throws Exception{
        int input=   calculator.input("3 + 5");
        assertThat(input).isEqualTo(8);

    }
    @Test
    public void 스트링빼기()throws Exception{
        int input=   calculator.input("3 - 5");
        assertThat(input).isEqualTo(-2);

    }
    @Test
    public void 스트링나누기()throws Exception{
        int input=  calculator.input("6 / 6");
        assertThat(input).isEqualTo(1);

    }
    @Test
    public void 스트링곱하기()throws Exception{
       int input=   calculator.input("2 * 2");
        assertThat(input).isEqualTo(4);

    }

    @Test
    public void 스트링_여러개입력_곱하기()throws Exception{
        int input=  calculator.input("2 * 2 * 2 * 2 * 2");
        assertThat(input).isEqualTo(32);
    }

    @Test
    public void 스트링_여러개입력() throws Exception {
        int input=  calculator.input("2 + 2 * 2 - 2 / 2");
        assertThat(input).isEqualTo(3);
    }

    @Test (expected=IllegalArgumentException.class)
    public void 공백체크()throws Exception{
         calculator.input(" ");

    }

    @Test (expected=NullPointerException.class)
    public void 널체크()throws Exception{
        calculator.input(null);
    }






}