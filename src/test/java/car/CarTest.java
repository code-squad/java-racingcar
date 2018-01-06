package car;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by youngjae on 2018. 1. 6..
 */
public class CarTest {

    @Test
    public void Car의_출력값이_잘_찍히는가() {
        Car car1 = new Car(4);
        Car car2 = new Car(5);
        Car car3 = new Car(6);

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

}
