package racing.car;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Moonchan on 2018. 1. 8..
 */
public class CarListTest {

    String[] names = {"1", "2", "3"};

    @Test
    public void createCarList() {
        CarList carList = new CarList(10);
        assertEquals(10, carList.size());
    }

    @Test
    public void createCarListWithNames() {
        CarList carList = new CarList(names);

        assertEquals(names.length, carList.size());
    }

    @Test
    public void noWinner() {
        CarList carList = new CarList(0);
        List<Car> winners = carList.getWinners();

        assertTrue(winners.isEmpty());
    }

    @Test
    public void oneWinner() {
        List<Car> cars = new ArrayList();
        cars.add(CarFactory.createAlwaysMoveCar(names[0]));
        cars.add(CarFactory.createNeverMoveCar(names[1]));
        cars.add(CarFactory.createNeverMoveCar(names[2]));

        CarList carList = new CarList(cars);
        carList.moveAll();
        List<Car> winners = carList.getWinners();

        assertArrayEquals(cars.subList(0,1).toArray(), winners.toArray());
    }

    @Test
    public void multipleWinner() {
        List<Car> cars = new ArrayList();
        cars.add(CarFactory.createAlwaysMoveCar(names[0]));
        cars.add(CarFactory.createAlwaysMoveCar(names[1]));
        cars.add(CarFactory.createNeverMoveCar(names[2]));

        CarList carList = new CarList(cars);
        carList.moveAll();
        List<Car> winners = carList.getWinners();

        assertArrayEquals(cars.subList(0,2).toArray(), winners.toArray());
    }

    @Test
    public void emptyCarList() {
        CarList carList = new CarList(0);
        assertTrue(carList.isEmpty());
    }

}