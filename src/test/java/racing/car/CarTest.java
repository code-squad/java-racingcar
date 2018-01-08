package racing.car;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Moonchan on 2018. 1. 6..
 */
public class CarTest {

    @Test
    public void movableCar() {
        Car movableCar = new Car(() -> true);
        movableCar.move();
        assertEquals(1, movableCar.getPosition());
    }

    @Test
    public void notMovableCar() {
        Car notMovableCar = new Car(() -> false);
        notMovableCar.move();
        assertEquals(0, notMovableCar.getPosition());
    }

}