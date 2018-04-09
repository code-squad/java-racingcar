package racing;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class RacingGameTest {

    RacingGame game;

    @Before
    public void setup(){
        game = new RacingGame();
        game.readyRacing("brown,kevin");
    }

    @Test(expected = IllegalArgumentException.class)
    public void 충분하지_않은_Car_Trial_수(){
        RacingGame testGame = new RacingGame();
        testGame.readyRacing("brown");
    }

    @Test
    public void 전진(){
        Car car = new Car("brown");
        int num = 8;

        game.move(car, num);
        assertThat(car.getDistance()).isEqualTo(1);

    }

    @Test
    public void 멈춤(){
        Car car = new Car("brown");
        int num = 4;

        game.move(car, num);

        assertThat(car.getDistance()).isEqualTo(0);
    }

    @Test
    public void getBestDriverNamesTest(){
        Car brown = new Car("brown");
        Car kevin = new Car("kevin");
        List<Car> drivers = Arrays.asList(brown,kevin);

        List<String> driverNames = new ArrayList<>();
        driverNames.add("brown");
        driverNames.add("kevin");

        assertThat(game.getBestDriverNames(drivers)).isEqualTo(driverNames);
    }

    @Test
    public void findBestDriversTest(){
        List<String> target = game.getBestDrivers();
        List<String> expected = Arrays.asList("brown","kevin");

        assertThat(target).isEqualTo(expected);
    }

    @Test
    public void findBestDriverTest(){
        Car brown = new Car("brown");
        Car karl = new Car("karl");
        List<Car> target = new ArrayList<>();

        target.add(brown);
        target.add(karl);

        brown.move(6);
        brown.move(6);
        brown.move(6);

        List<Car> actual = game.findBestDrivers(3,target);

        assertThat(actual.size()).isEqualTo(1);
    }



}