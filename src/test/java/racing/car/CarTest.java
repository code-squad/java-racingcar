package racing.car;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.*;

/**
 * Created by Moonchan on 2018. 1. 6..
 */
public class CarTest {

    @Test
    public void testCarMove() {
        Movable movable = () -> true;
        Car car = new Car(movable);
        for(int i=0; i<10; i++) {
            car.move();
        }
        assertEquals(10, car.getPosition());
    }

}