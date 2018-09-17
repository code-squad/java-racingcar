package racingcar;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {
    //1. random 값이 4이상일때 position 이 1 증가하는지에 관한 테스터
    @Test
    public void trueMove() {
        Car car = new Car("pobi",4);

        car.movePosition(4);
        assertThat(car.getPosition()).isEqualTo(5);
    }

    //2 . 안움직이는지 확인
    @Test
    public void falseMove() {
        Car car = new Car("pobi",4);

        car.movePosition(3);
        assertThat(car.getPosition()).isEqualTo(6);
    }

    //3. max 값을 찾는 테스트 코드
    @Test
    public void findMax() {
        Car[] cars = {new Car("pobi", 3), new Car("honux", 1),
                new Car("podo", 4)};

        int max = RacingGame.findMax(cars);

        assertThat(max).isEqualTo(4);
    }

    //4. 우승자 이름 찾기
    @Test
    public void findWinners() {
        Car[] cars = {new Car("pobi", 3), new Car("honux", 1),
                new Car("podo", 4)};

        String[] winners = RacingGame.winners(cars);

        assertThat(winners.length).isEqualTo(1);
        assertThat(winners[0]).isEqualTo("podo");
    }

    @Test
    public void generateWinnerText() {
        String[] winners = {"pobi","honux"};
        String text = String.join(",",winners);

        assertThat(text).isEqualTo("pobi,honux");
    }
}