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
    public void nothing(){

    }


/*    @Test
    public void 입력기능(){
       String input=  calculator.input("3");
        assertThat(input).isEqualTo(3);
    }*/

/*    @Test
    public void 입력기능_숫자로변경(){
        int input=  calculator.input("3");
        assertThat(input).isEqualTo(3);
    }*/
    @Test
    public void 더하기(){
        int input=  calculator.sum(1,2);
        assertThat(input).isEqualTo(3);
    }

    @Test
    public void 빼기(){
        int input=  calculator.minus(5,2);
        assertThat(input).isEqualTo(3);
    }

    @Test
    public void 나누기(){
        int input=  calculator.divide(6,6);
        assertThat(input).isEqualTo(1);
    }

    @Test
    public void 곱하기(){
        int input=  calculator.multi(2,2);
        assertThat(input).isEqualTo(4);
    }


    @Test
    public void 스트링더하기(){
        String input=  calculator.input("3 + 5");
        assertThat(input).isEqualTo("8");

    }
    @Test
    public void 스트링빼기(){
        String input=  calculator.input("3 - 5");
        assertThat(input).isEqualTo("-2");

    }
    @Test
    public void 스트링나누기(){
        String input=  calculator.input("6 / 6");
        assertThat(input).isEqualTo("1");

    }
    @Test
    public void 스트링곱하기(){
        String input=  calculator.input("2 * 2");
        assertThat(input).isEqualTo("4");

    }





}