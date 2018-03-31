package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    // 두개의 숫자 가져와 계산할 것
    @Test
    public void 덧셈_연산(){
        int result = calculator.add(3,5);

        assertThat(result).isEqualTo(8);
    }

    @Test
    public void 뺄셈_연산(){
        int result = calculator.substract(12,2);

        assertThat(result).isEqualTo(10);
    }

    @Test
    public void 곱셈_연산(){
        int result = calculator.muliply(5,2);

        assertThat(result).isEqualTo(10);
    }

    @Test
    public void 나눗셈_연산(){
        int result = calculator.divide(20,2);

        assertThat(result).isEqualTo(10);
    }

    @Test(expected = ArithmeticException.class)
    public void 나누기_0_으로(){
        calculator.divide(10,0);

    }

}
