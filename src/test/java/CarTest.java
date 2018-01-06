import car.Car;
import car.CarManager;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {

    CarManager carManager;

    @Before
    public void init(){
        carManager = new CarManager();
    }

    @Test
    public void carMove테스트(){
        Car car = new Car();
        for(int i=0;i<10000; i++){
            assertTrue(car.tryForward(3, 9) <= 9);
        }
    }


    @Test
    public void createCarBySize테스트(){
        carManager.createCarBySize(3);
        assertEquals(carManager.getCars().size(), 3);
    }

    @Test
    public void moveCars테스트(){
        carManager.createCarBySize(3);
        assertEquals(carManager.getCars().size(), 3);
    }


}
