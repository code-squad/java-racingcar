import car.Car;
import car.CarManager;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {

    CarManager carManager;

    @Test
    public void carMove테스트(){
        Car car = new Car();
        for(int i=0;i<10000; i++){
            assertTrue(car.tryForward(3, 9) <= 9);
        }
    }

    @Test
    public void createCarBySize테스트(){
        carManager = new CarManager(3,5);
        carManager.createCarBySize();
        assertEquals(carManager.getCars().size(), 3);
    }

}
