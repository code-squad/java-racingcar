package car;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

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

        assertEquals(car1.print(), "----");
        assertEquals(car2.print(), "-----");
        assertEquals(car3.print(), "------");
    }

    @Test
    public void Car의_4이상일때만_true를_반환하는가() {
        Car car = new Car();

        assertEquals(car.checkIsMoreFour(0), false);
        assertEquals(car.checkIsMoreFour(3), false);
        assertEquals(car.checkIsMoreFour(4), true);
        assertEquals(car.checkIsMoreFour(9),  true);
    }

    @Test
    public void Car의_이름이_잘_찍히는가() {
        String pobi = "pobi";
        String crong = "crong";
        String honux = "honux";

        assertEquals(new Car(pobi).getName(), pobi);
        assertEquals(new Car(crong).getName(), crong);
        assertEquals(new Car(honux).getName(), honux);
    }
}
