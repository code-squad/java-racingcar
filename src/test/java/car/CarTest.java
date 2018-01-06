package car;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CarTest {
    private Car car = new Car(1);
    @Test
    public void randomInt(){
        for(int i = 0; i < 1000; i++){
            assertTrue(car.randomInt() < 10 && car.randomInt() >= 0);
        }
    }
}
