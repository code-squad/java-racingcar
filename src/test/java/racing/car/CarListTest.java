package racing.car;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Moonchan on 2018. 1. 8..
 */
public class CarListTest {


    @Test
    public void createCars() {
        CarList carList = new CarList(10);
        assertEquals(10, carList.size());
    }

    @Test
    public void emptyCarList() {
        CarList carList = new CarList(0);
        assertTrue(carList.isEmpty());
    }

}