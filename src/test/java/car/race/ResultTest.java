package car.race;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ResultTest {
    Result result;
    Car car1, car2, car3;
    List<Car> cars;

    @Before
    public void setUp(){
        result = new Result();
        car1 = new Car("A");
        car2 = new Car("B");
        car3 = new Car("C");
        car1.runCar(new int[]{1,2,3,4});
        car2.runCar(new int[]{0,0,9,9});
        car3.runCar(new int[]{5,6,7,8});
        cars = new ArrayList<>(Arrays.asList(car1, car2, car3));
    }

    @Test
    public void findMaxPosition() {
        result.findMaxPosition(cars);
        assertEquals(4,result.maxPosition);
    }

    @Test
    public void findWinner() {
        result.findWinner(cars);
        assertEquals("C",result.winnerNames);
    }
}
//질문: production code에는 maxPosition과 winnerNames의 접근제어자가 private 인데
// 테스트 할때는 바꾸어야 하나?