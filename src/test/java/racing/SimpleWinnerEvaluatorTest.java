package racing;

import org.junit.Before;
import org.junit.Test;
import racing.model.Car;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SimpleWinnerEvaluatorTest {
    private SimpleWinnerEvaluator simpleWinnerEvaluator;

    @Before
    public void setUp() {
        simpleWinnerEvaluator = new SimpleWinnerEvaluator();
    }

    @Test
    public void voteWinner() throws Exception {
        Car a = getNewCar("a");
        Car b = getNewCar("b");
        Car c = getNewCar("c");

        List<Car> cars = new ArrayList<>();
        cars.add(a);
        cars.add(b);
        cars.add(c);

        a.setPosition(1);
        b.setPosition(2);
        c.setPosition(3);
        List<Car> winnersJustOne = simpleWinnerEvaluator.voteWinner(cars);
        assertEquals(c, winnersJustOne.get(0));

        a.setPosition(1);
        b.setPosition(2);
        c.setPosition(2);
        List<Car> winnersSameTwo = simpleWinnerEvaluator.voteWinner(cars);
        assertEquals(b, winnersSameTwo.get(0));
        assertEquals(c, winnersSameTwo.get(1));

        a.setPosition(2);
        b.setPosition(3);
        c.setPosition(1);
        List<Car> winnersJustOneButNotLast = simpleWinnerEvaluator.voteWinner(cars);

        assertEquals(b, winnersJustOneButNotLast.get(0));
    }

    private Car getNewCar(String name) {
        return Car.newInstance(name);
    }

}
