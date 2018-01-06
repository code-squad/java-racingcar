package racing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    @Test
    public void move_4보다크거나같은경우() throws Exception {
        Car car = new Car(() -> 5);

        int move = car.move();

        assertEquals(move, 5);
    }

    @Test
    public void move_4보다작은경우() throws Exception {
        Car car = new Car(() -> 3);

        int move = car.move();

        assertEquals(move, 0);
    }
}