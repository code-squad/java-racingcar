package calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by Administrator on 2018-03-31.
 */
public class CalculatorTest {

    Calculator cal = new Calculator();

    @Before
    public void beforeTest(){
        System.out.println("문자열 계산기 Test 시작");
    }

    @Test
    public void addTest(){
        int result = cal.add(10, 10);
        assertEquals(20, result, 0);
        //int result = Calculator.add(s:"1+2");
        //assertThat(result).isEqualTo(3);
    }

    @Test
    public void subTest(){
        int result = cal.subtract(10, 10);
        assertEquals(0, result, 0);
    }

    @Test
    public void multiplyTest(){
        int result = cal.multiply(10, 10);
        assertEquals(100, result, 0);
    }

    @Test
    public void devideTest(){
        int result = cal.devide(10, 10);
        assertEquals(1, result, 0);
    }

    @After
    public void afterTest(){
        System.out.println("문자열 계산기 테스트 끝");
    }
}
