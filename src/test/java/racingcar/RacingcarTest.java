package racingcar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.*;

public class RacingcarTest {
    public final static int POS_MIN = 1;
    public final static int POS_MAX = 7;
    public final static int[] POS_CAR = {POS_MAX, POS_MIN, 5, POS_MAX};
    Random random = new Random();
    ArrayList<Car> cars;
    ArrayList<Car> winner;

    @Before
    public void setUp() throws Exception {
        cars = new ArrayList<>();
        winner = new ArrayList<>();
        for (int i = 0; i < POS_CAR.length; i++) {
            Car car = new Car("testCar" + i, POS_CAR[i]);
            cars.add(car);
            if (car.getCarPosition() == POS_MAX) {
                winner.add(car);
            }
        }
    }

    @After
    public void tearDown() throws Exception {
        cars = null;
    }

    @Test
    public void addPosition() {
        for (Car car : cars) {
            int randomVal = random.nextInt(Racing.POS_BOUND);
            int beforeAdd = car.getCarPosition();
            car.addPosition(randomVal);
            int afterAdd = car.getCarPosition();

            if (randomVal >= Car.POS_STD) {
                assertEquals(beforeAdd + 1, afterAdd);
            } else {
                assertEquals(beforeAdd, afterAdd);
            }
        }
    }

    @Test
    public void findMaxPos() {
        int maxPos = Racing.POS_CAR_INIT;
        for (Car car : cars) {
            maxPos = car.findMaxPos(maxPos);
        }
        assertEquals(POS_MAX, maxPos);
    }

    @Test
    public void findWhoWin() {
        assertEquals(winner, ResultView.findWhoWin(cars, POS_MAX));
    }

    @Test
    public void hasSamePos() {
        for (int i = 0; i < cars.size(); i++) {
            assertEquals(true, cars.get(i).hasSamePos(POS_CAR[i]));
        }
    }


}