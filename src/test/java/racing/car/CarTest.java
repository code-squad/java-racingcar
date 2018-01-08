package racing.car;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Moonchan on 2018. 1. 6..
 */
public class CarTest {

    @Test
    public void testCarMove() {
        Car movableCar = new Car(() -> true);
        Car notMovableCar = new Car(() -> false);

        movableCar.move();
        notMovableCar.move();
        assertEquals(1, movableCar.getPosition());
        assertEquals(0, notMovableCar.getPosition());
    }

}