package racing;

import car.Car;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class GameResultTest {
    private List<Car> cars;

    @Before
    public void init() {
        cars = makeTestCarList();
    }

    @Test
    public void tryToPutCarTest() {
        int maxScore = 10;
        Car pobiCar = cars.get(0);
        List<String> winners = new ArrayList<>();

        GameResult.tryToPutWinner(winners, pobiCar, maxScore);

        assertEquals(winners.get(0), pobiCar.getName());
    }

    @Test
    public void getMaxScoreTest() {
        assertEquals(10, GameResult.getMaxScore(cars));
    }

    @Test
    public void getWinnerListTest() {
        String[] expectedWinner = new String[]{"pobi", "crong"};
        List<String> simulatedWinners = GameResult.getWinners(cars);
        assertEquals(expectedWinner.length, simulatedWinners.size());

        for(int i = 0 ; i < expectedWinner.length ; ++i)
            assertTrue(expectedWinner[i].equals(simulatedWinners.get(i)));
    }

    private List<Car> makeTestCarList() {
        return Arrays.asList(
                new Car("pobi").setCurrentPosition(10),
                new Car("crong").setCurrentPosition(10),
                new Car("honux").setCurrentPosition(6)
        );
    }
}
