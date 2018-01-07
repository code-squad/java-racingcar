package car;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    @Test
    public void Car의_move가_4이상일때만_증가하는가() {
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

}
