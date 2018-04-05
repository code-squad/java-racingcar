package racingcar;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {

    @Test(expected = IllegalArgumentException.class)
    public void 생성자_파라미터_null체크_확인() {
        RacingGame racingGame = new RacingGame(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 생성자_파라미터_차갯수0체크_확인() {
        List<Car> carList = new ArrayList<Car>();
        RacingGame racingGame = new RacingGame(carList);
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
        List<Car> carList = new ArrayList<>();
        carList.add(new Car().setCarName("test1"));
        carList.add(new Car().setCarName("test2"));
        carList.add(new Car().setCarName("test3"));

        GameResult gameResult = new GameResult();
        gameResult.setCarList(carList);

        gameResult.moveCar(0);
        gameResult.moveCar(0);
        gameResult.moveCar(0);
        gameResult.moveCar(1);
        gameResult.moveCar(1);
        gameResult.moveCar(2);

        List<String> result = gameResult.getCarRacingWinner();

        assertThat(printWinner(result)).isEqualTo("test1");
    }

    @Test
    public void 승자n명_테스트() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car().setCarName("test1"));
        carList.add(new Car().setCarName("test2"));
        carList.add(new Car().setCarName("test3"));

        GameResult gameResult = new GameResult();
        gameResult.setCarList(carList);

        gameResult.moveCar(0);
        gameResult.moveCar(1);
        gameResult.moveCar(2);

        List<String> result = gameResult.getCarRacingWinner();

        assertThat(printWinner(result)).isEqualTo("test1, test2, test3");
    }

    private String printWinner(List<String> winnerList) {
        int winnerListLength = winnerList.size();
        StringBuilder sb = new StringBuilder();

        for (int index = 0; index < winnerListLength; index++) {
            sb.append(winnerList.get(index));
            if (index != winnerListLength - 1) {
                sb.append(", ");
            }
        }

        return sb.toString();
    }
}
