package racing.car;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.*;

/**
 * Created by Moonchan on 2018. 1. 6..
 */
public class CarTest {

    @Test
    public void move() throws Exception {
        NumberGenerator generator = () -> 10;
        Car car = new Car(generator);
        for(int i=0; i<10; i++) {
            car.move();
        }
        assertEquals(10, car.getPosition());
    }

    @Test
    public void cantMoveCar() throws Exception {
        NumberGenerator generator = () -> 0;
        Car car = new Car(generator);
        for(int i=0; i<10; i++) {
            car.move();
        }
        assertEquals(0, car.getPosition());
    }

}