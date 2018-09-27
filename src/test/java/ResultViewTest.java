<<<<<<< HEAD
import car.Car;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import view.ResultView;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

//자동차 목록의 위치 값이 가장 큰 값을 찾는 메소드에 대한 테스트 코드를 추가한다.
=======
    import org.junit.After;
    import org.junit.Before;
    import org.junit.Test;

    import java.util.ArrayList;

    import static org.assertj.core.api.Assertions.assertThat;

    //자동차 목록의 위치 값이 가장 큰 값을 찾는 메소드에 대한 테스트 코드를 추가한다.
>>>>>>> daesoop
//자동차 목록에서 가장 큰 위치 값에 해당하는 자동차 목록을 구하는 메소드에 대한 테스트 코드를 추가한다.
public class ResultViewTest {
    private ResultView result;

    @Before
    public void setup() {
        result = new ResultView();
    }
<<<<<<< HEAD

    @Test
    public void winner() {
        car.Car[] cars = {new car.Car("daesoop", 5), new car.Car("choi", 2)};
=======
    @Test
    public void winner() {
        Car[] cars = {new Car("daesoop", 5), new Car("choi", 2) };
>>>>>>> daesoop
        int max = result.winner(cars);
        assertThat(max).isEqualTo(5);
    }

    @Test
    public void winners() {
<<<<<<< HEAD
        Car[] cars = {new Car("daesoop", 5), new Car("choi", 2)};
        ArrayList<String> winner = ResultView.winners(cars);
        assertThat(winner.size()).isEqualTo(1);
        assertThat(winner.get(0)).isEqualTo("daesoop");
    }

=======
       Car[] cars = {new Car("daesoop", 5), new Car("choi", 2) };
       ArrayList<String> winner = ResultView.winners(cars);
        assertThat(winner.size()).isEqualTo(1);
        assertThat(winner.get(0)).isEqualTo("daesoop");
    }
>>>>>>> daesoop
    @After
    public void teardown() {

    }
}
