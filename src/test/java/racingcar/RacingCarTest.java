package racingcar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by Administrator on 2018-03-31.
 */
public class RacingCarTest {

    Car car;

    @Before
    public void beforeTest(){
        System.out.println("테스트 시작");
        car = new Car();
    }

    @Test
    public void moveTrue(){
        car.move(7);
        assertEquals(1, car.getPosition());
    }

    @Test
    public void moveFalse(){
        car.move(3);
        assertEquals(0, car.getPosition());
    }

    @After
    public void afterTest(){
        System.out.println("테스트 종료");
    }
}
