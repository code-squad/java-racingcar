import car.Car;
import car.CarManager;
import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CarTest {

    CarManager carManager;

    @Test
    public void carMove테스트(){
        Car car = new Car();
        IntStream.range(0,10000).forEach(i->assertTrue(car.tryForward(3, 9) <= 9));
    }

    @Test
    public void createCarBySize테스트(){
        carManager = new CarManager(3,5);
        assertEquals(carManager.getCars().size(), 3);
    }

}
