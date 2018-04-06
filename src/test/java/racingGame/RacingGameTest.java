package racingGame;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by hongjong-wan on 2018. 3. 31..
 */
public class RacingGameTest {


    @Test
    public void 우승자발견로직 () {

        List<Car> cars = new ArrayList<>();
        Car car1 = new Car("aaa");
        car1.move(1);
        Car car2 = new Car("bbb");
        car2.move(5);
        cars.add(car1);
        cars.add(car2);

        // 교수님, 해당 테스트를 위해 RacingGame 클래스에서 List를 받는 생성자를 생성했습니다.
        // 왜냐하면 직접 설정한 Car 리스트여야만 결과를 예측할 수 있으니까 이정도는 괜찮겠죠?
        // 테스트를 위해 만들었지만 List를 받는 생성자도 필요할수도 있구요
        RacingGame racingGame = new RacingGame(cars);

        assertEquals(car2, racingGame.findWinners().get(0));

    }



}
