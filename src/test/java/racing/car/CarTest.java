package racing.car;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Moonchan on 2018. 1. 6..
 */
public class CarTest {

    @Test
    public void moveCar() {
        Car movableCar = CarFactory.createAlwaysMoveCar("move");
        movableCar.move();
        assertEquals(1, movableCar.getPosition());
    }

    @Test
    public void notMoveCar() {
        Car notMovableCar = CarFactory.createNeverMoveCar("notMove");
        notMovableCar.move();
        assertEquals(0, notMovableCar.getPosition());
    }

}