import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void initCarsTest() {
        int carCount = 3;
        Car[] cars =  Main.initCars(carCount);
        assertEquals(carCount, cars.length);
    }
}
