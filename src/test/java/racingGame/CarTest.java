package racingGame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    private Car car;

    @Before
    public void setUp() {
        car = new Car(1,"jisun");
    }

    @Test
    public void 프린트_테스트() throws Exception {
        assertEquals("-",car.resultString());
    }

    @Test
    public void 랜덤이_기준보다_높을때() throws Exception {
        car.rePosition(5);
        assertEquals(2,car.getPosition());
    }

    @Test
    public void 랜덤이_기준보다_낮을때() {
        car.rePosition(1);
        assertEquals(1,car.getPosition());
    }

    @Test
    public void 우승자_테스트() {
        assertEquals(true,car.isMaxPosition(1));
    }


}