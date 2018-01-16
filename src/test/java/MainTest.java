import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void initCarsTest() {
        int carCount = 3;
        List<Car> cars =  Main.initCars(carCount);
        assertEquals(carCount, cars.size());
    }
}
