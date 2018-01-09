package racing;

import car.Car;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class GameResultTest {
    private List<Car> carList;

    @Before
    public void init() {
        carList = makeTestCarList();
    }

    @Test
    public void tryToPutCarTest() {
        int maxScore = 10;
        Car pobiCar = carList.get(0);
        List<String> winnerList = new ArrayList<>();

        GameResult.tryToPutWinner(winnerList, pobiCar, maxScore);

        assertEquals(winnerList.get(0), pobiCar.getName());
    }

    @Test
    public void getMaxScoreTest() {
        assertEquals(10, GameResult.getMaxScore(carList));
    }

    @Test
    public void getWinnerListTest() {
        String[] expectedWinner = new String[]{"pobi", "crong"};
        List<String> simulatedWinner = GameResult.getWinnerList(carList);
        assertEquals(expectedWinner.length, simulatedWinner.size());

        for(int i = 0 ; i < expectedWinner.length ; ++i)
            assertTrue(expectedWinner[i].equals(simulatedWinner.get(i)));
    }

    private List<Car> makeTestCarList() {
        List<Car> carList = new ArrayList<>();

        Car pobiCar = new Car("pobi");
        Car crongCar = new Car("crong");
        Car honuxCar = new Car("honux");

        forceToMoveCar(pobiCar, 10);
        forceToMoveCar(crongCar, 10);
        forceToMoveCar(honuxCar, 6);

        carList.add(pobiCar);
        carList.add(crongCar);
        carList.add(honuxCar);

        return carList;
    }

    private void forceToMoveCar(Car car, int moveTime) {
        for(int i = 0 ; i < moveTime ; ++i)
            car.tryMove(5);
    }
}
