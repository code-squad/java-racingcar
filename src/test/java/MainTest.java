import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void initCarsTest() {
        String[] carNames = {"a","b","c"};
        List<Car> cars =  Main.initCars(carNames);
        assertEquals(carNames.length, cars.size());
    }
}
