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
        game = new RacingGame("brown,kevin");
        game.readyRacing();
    }

    @Test(expected = IllegalArgumentException.class)
    public void 충분하지_않은_Car_Trial_수(){
        RacingGame testGame = new RacingGame("brown");
        testGame.readyRacing();
    }

    @Test
    public void 전진(){
        Car car = new Car("brown");
        int num = 8;

        game.move(car, num);
        assertThat(car.getLocation()).isEqualTo("-");

    }

    @Test
    public void 멈춤(){
        Car car = new Car("brown");
        int num = 4;

        game.move(car, num);

        assertThat(car.getLocation()).isEqualTo("");
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
        List<Car> target = new ArrayList<>();

        brown.go();
        brown.go();
        brown.go();

        game.findBestDriver(3, target, brown);

        assertThat(target.size()).isEqualTo(1);
    }



}