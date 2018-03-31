package caculate;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertEquals;

public class CaculateTest {
    @Before
    public void setUp(){
        System.out.println("setup");
    }

    @Test
    public void 더하기() {
        int result = Caculate.caculate("9 + 10");
        assertThat(result).isEqualTo(19);
    }

    @Test
    public void 빼기() {
        int result = Caculate.caculate("15 - 10");
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void 곱하기() {
        int result = Caculate.caculate("15 * 10");
        assertThat(result).isEqualTo(150);
    }

    @Test
    public void 나누기() {
        int result = Caculate.caculate("20 / 10");
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void 여러개_더하기() {
        int result = Caculate.caculate("9 + 10 + 10");
        assertThat(result).isEqualTo(29);
    }

    @After
    public void tearDown(){
        System.out.println("tearDown");
    }

}
