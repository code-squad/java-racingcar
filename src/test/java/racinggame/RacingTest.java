package racinggame;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class RacingTest {


    private Racing racing;
    @Before
    public void setUp() throws Exception {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Sooyoung",3));
        cars.add(new Car("Test",3));
        cars.add(new Car("IPhone",1));
        racing= new Racing(cars);
    }

    @Test
    public void getWinners() {
        System.out.println(racing.getWinners());
    }

}
