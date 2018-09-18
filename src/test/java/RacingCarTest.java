import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import racingcar.RacingCar;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RacingCarTest {
    private RacingCar car;

    @Before
    public void setUp() {
        car = new RacingCar();
        String[] names = {"pobi", "honux", "forever"};
        car.makeCar(names);

        //pobi, forever가 우승하는 경우
        car.getCars().get(0).moveCar(0, 3);
        car.getCars().get(1).moveCar(0, 1);
        car.getCars().get(2).moveCar(0, 3);
    }

    @Test
    public void findMaxCarDistTest() {
        int maxDist = car.findMaxCarDist();
        assertThat(maxDist).isEqualTo(3);
    }

    @Test
    public void findWinnerTest() {
        List<String> winners = new ArrayList<>();
        winners = car.findWinners();
        winners.remove(0);
        assertThat(winners.get(0)).isEqualTo("pobi");
        assertThat(winners.get(2)).isEqualTo("forever");
    }

    @After
    public void endTest() {
        System.out.println("End Test!");
    }
}
