import car.Car;
import car.CarManager;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Scanner;

public class CarTest {

    Scanner scan;
    int carSize;
    int carTryNumber;
    CarManager carManager;

    @Before
    public void init(){
        carManager = new CarManager();
        carSize = 0;
        carTryNumber =0;
    }

    @Test
    public void carMove테스트(){
        Car car = new Car();
        car.move(3);
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
