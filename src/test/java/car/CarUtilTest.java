package car;

import org.junit.Test;

import java.util.stream.IntStream;

import static car.RacingUtils.racingFormatting;
import static car.RacingUtils.resultFormatting;
import static org.junit.Assert.assertEquals;

public class CarUtilTest {

    @Test
    public void 레이싱_UI_포맷이_올바른가() {
        Car car = new Car("test");
        int tryCount = 3;
        IntStream.range(0, tryCount).forEach(i -> car.randomMove(5));
        assertEquals(racingFormatting(car), "test : ---");
        car.randomMove(5);
        assertEquals(racingFormatting(car), "test : ----");
    }

    @Test
    public void 결과_포맷이_올바른가() {
        String result = "pobi, honux";
        assertEquals(resultFormatting(result), result + "가 최종 우승했습니다.");
    }
}
