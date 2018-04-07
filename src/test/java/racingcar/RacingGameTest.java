package racingcar;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {

    @Test(expected = IllegalArgumentException.class)
    public void 생성자_파라미터_null체크_확인() {
        RacingGame racingGame = new RacingGame(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 생성자_파라미터_차갯수0체크_확인() {
        List<Car> cars = new ArrayList<Car>();
        RacingGame racingGame = new RacingGame(cars);
    }

    @Test
    public void 이동_출력() {
        String result = ResultView.printMove(3);
        assertThat(result).isEqualTo("---");
    }

    @Test
    public void 숫자4_미만_이동_불가능_확인() {
        boolean result = RacingGame.isMoving(3);
        assertThat(result).isEqualTo(false);
    }

    @Test
    public void 숫자4_이상_이동_가능_확인() {
        boolean result = RacingGame.isMoving(4);
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void 승자1명_테스트() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("test1"));
        cars.add(new Car("test2"));
        cars.add(new Car("test3"));

        RacingGame rc = new RacingGame(cars);

        rc.moveCar(0);
        rc.moveCar(0);
        rc.moveCar(0);
        rc.moveCar(1);
        rc.moveCar(1);
        rc.moveCar(2);

        List<String> result = rc.getCarRacingWinner();

        assertThat(printWinner(result)).isEqualTo("test1");
    }

    @Test
    public void 승자n명_테스트() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("test1"));
        cars.add(new Car("test2"));
        cars.add(new Car("test3"));

        RacingGame rc = new RacingGame(cars);

        rc.moveCar(0);
        rc.moveCar(1);
        rc.moveCar(2);

        List<String> result = rc.getCarRacingWinner();

        assertThat(printWinner(result)).isEqualTo("test1, test2, test3");
    }

    private String printWinner(List<String> winners) {
        int winnersLength = winners.size();
        StringBuilder sb = new StringBuilder();

        for (int index = 0; index < winnersLength; index++) {
            sb.append(winners.get(index));
            if (index != winnersLength - 1) {
                sb.append(", ");
            }
        }

        return sb.toString();
    }
}
