package racing;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class RacingGameTest {

    RacingGame game;

    @Before
    public void setup(){
        game = new RacingGame();
    }

    @Test(expected = IllegalArgumentException.class)
    public void 충분하지_않은_Car_Trial_수(){
        RacingGame testGame = new RacingGame(1);

        testGame.readyRacing();
    }

    @Test
    public void 전진(){
        Car car = new Car();
        int num = 8;

        game.move(car, num);

        assertThat(car.getLocation()).isEqualTo("-");

    }

    @Test
    public void 멈춤(){
        Car car = new Car();
        int num = 4;

        game.move(car, num);

        assertThat(car.getLocation()).isEqualTo("");
    }


}