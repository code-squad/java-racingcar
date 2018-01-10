package racinggame.dto;

import org.junit.Test;
import racinggame.dto.CarDto;
import racinggame.dto.RacingResult;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingResultTest {
    @Test
    public void createWinnerNames() {
        RacingResult result = new RacingResult();
        result.add(new CarDto("pobi", 8));
        result.add(new CarDto("honux", 7));
        result.add(new CarDto("crong", 8));
        assertThat(result.createWinnerNames()).isEqualTo("pobi,crong");
    }

    @Test
    public void maxPosition() {
        List<CarDto> cars = Arrays.asList(
                new CarDto("pobi", 8),
                new CarDto("honux", 7),
                new CarDto("crong", 8)
        );
        assertThat(RacingResult.maxPosition(cars)).isEqualTo(8);
    }

    @Test
    public void getWinners() {
        List<CarDto> cars = Arrays.asList(
                new CarDto("pobi", 8),
                new CarDto("honux", 7),
                new CarDto("crong", 8)
        );
        List<CarDto> winners = RacingResult.getWinners(cars, 8);
        assertThat(winners.size()).isEqualTo(2);
    }

    @Test
    public void getWinnerNames() {
        List<CarDto> winners = Arrays.asList(
                new CarDto("pobi", 8),
                new CarDto("crong", 8)
        );
        assertThat(RacingResult.getWinnerNames(winners)).contains("pobi", "crong");
    }

    @Test
    public void joinComma() {
        List<String> winnerNames = Arrays.asList("pobi", "crong");
        assertThat(RacingResult.joinComma(winnerNames)).isEqualTo("pobi,crong");
    }
}
