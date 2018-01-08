package racing.car;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.*;

/**
 * Created by Moonchan on 2018. 1. 6..
 */
public class CarTest {

    @Test
    public void testAlwaysMoveEngine() {
        NumberGenerator generator = () -> 5;
        Engine engine = new Engine(4, generator);
        for(int i=0; i<10; i++) {
            assertTrue(engine.move());
        }
    }

    @Test
    public void testNeverMoveEngine() {
        NumberGenerator generator = () -> 0;
        Engine engine = new Engine(4, generator);
        for(int i=0; i<10; i++) {
            assertFalse(engine.move());
        }
    }

    @Test
    public void testCarMove() {
        NumberGenerator generator = () -> 5;
        Engine engine = new Engine(4, generator);
        Car car = new Car(engine);
        for(int i=0; i<10; i++) {
            car.move();
        }
        assertEquals(10, car.getPosition());
    }

}