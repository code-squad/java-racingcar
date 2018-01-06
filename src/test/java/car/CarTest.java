package car;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by youngjae on 2018. 1. 6..
 */
public class CarTest {

    @Test
    public void Car의_출력값이_잘_찍히는가() {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        IntStream.rangeClosed(0, 3).forEach(i -> car1.increaseMove());
        IntStream.rangeClosed(0, 4).forEach(i -> car2.increaseMove());
        IntStream.rangeClosed(0, 5).forEach(i -> car3.increaseMove());

        assertEquals("----", car1.print());
        assertEquals("-----", car2.print());
        assertEquals("------", car3.print());
    }

    @Test
    public void Car의_4이상일때만_true를_반환하는가() {
        Car car = new Car();

        assertFalse(car.checkIsMoreFour(0));
        assertFalse(car.checkIsMoreFour(3));
        assertTrue(car.checkIsMoreFour(4));
        assertTrue(car.checkIsMoreFour(9));
    }

    @Test
    public void Car의_이름이_잘_찍히는가() {
        String pobi = "pobi";
        String crong = "crong";
        String honux = "honux";

        assertEquals(pobi, new Car(pobi).getName());
        assertEquals(crong, new Car(crong).getName());
        assertEquals(honux, new Car(honux).getName());
    }
}
