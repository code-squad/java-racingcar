package racing;

import org.junit.Before;
import org.junit.Test;
import racing.model.Car;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SimpleWinnerEvaluatorTest {
    private SimpleWinnerEvaluator simpleWinnerEvaluator;
    private List<Car> cars;
    @Before
    public void setUp() {
        simpleWinnerEvaluator = new SimpleWinnerEvaluator();
        cars = prepareCars();
    }

    @Test
    public void voteWinnerJustOne() throws Exception {
        moveCar(1, cars.get(0));
        moveCar(2, cars.get(1));
        moveCar(3, cars.get(2));

        List<Car> winnersJustOne = simpleWinnerEvaluator.voteWinner(cars);
        assertEquals(cars.get(2), winnersJustOne.get(0));
    }

    @Test
    public void voteWinnerSameTwo() {
        moveCar(1, cars.get(0));
        moveCar(2, cars.get(1));
        moveCar(2, cars.get(2));

        List<Car> winnersJustOne = simpleWinnerEvaluator.voteWinner(cars);
        assertEquals(cars.get(1), winnersJustOne.get(0));
        assertEquals(cars.get(2), winnersJustOne.get(1));
    }

    @Test
    public void voteWinnerJustOneButNotLast() {
        moveCar(2, cars.get(0));
        moveCar(3, cars.get(1));
        moveCar(1, cars.get(2));

        List<Car> winnersJustOneButNotLast = simpleWinnerEvaluator.voteWinner(cars);
        assertEquals(cars.get(1), winnersJustOneButNotLast.get(0));
    }

    private void moveCar(int moveCount, Car car) {
        for (int i=0; i<moveCount; i++) {
            car.move(true);
        }
    }

    private List<Car> prepareCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(getNewCar("a"));
        cars.add(getNewCar("b"));
        cars.add(getNewCar("c"));
        return cars;
    }

    private Car getNewCar(String name) {
        return Car.newInstance(name);
    }

}
