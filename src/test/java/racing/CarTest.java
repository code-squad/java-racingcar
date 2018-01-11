package racing;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;
/**
 * Created by Joeylee on 2018-01-06.
 */
public class CarTest {


    private Car car;
    private Car car1;
    private RacingGame racingGame;


    @Test
    public void 자동차_이동_테스트() {

        car = new Car("car1");
        car.move(4);
        car.move(5);

        assertEquals(2, car.getDistance());
    }

    @Test
    public void 자동차_이름_테스트() {

        car = new Car("car1");

        assertEquals("car1", car.getName());
    }

    @Test
    public void 자동차최종거리_출력_테스트() {

        racingGame = new RacingGame("car1,car2,car3");
        racingGame.racing(3);
        racingGame.printCarsDistance();

    }


}