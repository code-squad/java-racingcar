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
    public void Car의_4이상일때만_move가_증가하는가() {
        Car car = new Car("test");

        car.randomMove(0);
        assertEquals(0, car.getMove());
        car.randomMove(3);
        assertEquals(0, car.getMove());
        car.randomMove(4);
        assertEquals(1, car.getMove());
        car.randomMove(9);
        assertEquals(2, car.getMove());
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
