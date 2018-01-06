package racing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    @Test
    public void move_4보다크거나같은경우() throws Exception {
        Car car = new Car(() -> 5, "test");

        assertEquals(1, car.move());
    }

    @Test
    public void move_4보다작은경우() throws Exception {
        Car car = new Car(() -> 3, "test");

        assertEquals(0, car.move());
    }

    @Test(expected = IllegalArgumentException.class)
    public void Car_널인경우() throws Exception {
        new Car(null, "test");
    }

    @Test(expected = IllegalArgumentException.class)
    public void Car_빈문자열인경우() throws Exception {
        new Car(() -> 1, "");
    }
}