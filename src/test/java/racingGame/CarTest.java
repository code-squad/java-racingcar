package racingGame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    Car car;

    @Before
    public void setUp(){
        car = new Car("myCar");
    }

    @Test
    public void 랜덤숫자_4이상일때_전진() {
        int result = 0;
        for(int i=4; i<10; ++i) {
            result += car.move(i);
        }
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void 랜덤숫자_3이하일때_전진안함() {
        int result = 1;
        for(int i=0; i<4; ++i) {
            result *= car.move(i);
        }
        assertThat(result).isNotEqualTo(0);
    }

    @After
    public void tearDown(){
        car = null;
    }
}
