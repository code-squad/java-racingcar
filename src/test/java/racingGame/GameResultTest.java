package racingGame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameResultTest {
    Car car1, car2, car3;
    ArrayList<Car> winnerCars;

    @Before
    public void setUp() throws Exception {
        car1 = new Car("myCar1", 10);
        car2 = new Car("myCar2", 5);
        car3 = new Car("myCar3", 5);
        winnerCars = new ArrayList<>();
    }

    @Test
    public void 더멀리갔나비교() {
        assertThat(true == GameResult.isFasterPosition(car1, car2)).isTrue();
    }

    @Test
    public void 동일하게갔나비교() {
        assertThat(true == GameResult.isSamePosition(car2, car3)).isTrue();
    }

    @Test
    public void 우승그룹추가_기존1등차보다_빠른경우() {
        winnerCars.add(car2);
        GameResult.addWinnerCar(winnerCars, car1);
        assertThat(winnerCars.get(0)).isEqualTo(car1);
    }

    @Test
    public void 우승그룹추가_기존1등차보다_느린경우() {
        winnerCars.add(car1);
        GameResult.addWinnerCar(winnerCars, car2);
        assertThat(winnerCars.get(0)).isEqualTo(car1);
    }

    @Test
    public void 우승그룹추가_기존1등과_동일한경우() {
        winnerCars.add(car2);
        GameResult.addWinnerCar(winnerCars, car3);
        assertThat(winnerCars.get(0).equals(car2) && winnerCars.get(1).equals(car3)).isTrue();
    }

    @Test
    public void 우승한_차그룹_반환() {
        ArrayList<Car> cars = new ArrayList();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        GameResult result = new GameResult(cars);
        List<Car> winnerCars = result.getWinnerCars();
        assertThat(winnerCars.get(0).equals(car1) && winnerCars.size() == 1).isTrue();
    }

    @Test
    public void 동반우승한_차그룹_반환() {
        ArrayList<Car> cars = new ArrayList();
        cars.add(car2);
        cars.add(car3);
        GameResult result = new GameResult(cars);
        List<Car> winnerCars = result.getWinnerCars();
        assertThat(winnerCars.get(0).equals(car2) && winnerCars.get(1).equals(car3)).isTrue();
    }

    @After
    public void tearDown() throws Exception {

    }
}
