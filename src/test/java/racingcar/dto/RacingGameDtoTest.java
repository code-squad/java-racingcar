package racingcar.dto;

import org.junit.Before;
import org.junit.Test;
import racingcar.dto.CarDto;
import racingcar.dto.RacingGameDto;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class RacingGameDtoTest {
    List<CarDto> cars = new ArrayList<>();
    List<CarDto> winners = new ArrayList<>();

    @Before
    public void setUp(){
        cars.add(CarDto.ofNameAndPosition("pobi",8));
        cars.add(CarDto.ofNameAndPosition("honux",7));
        cars.add(CarDto.ofNameAndPosition("choi",8));

        winners.add(CarDto.ofNameAndPosition("pobi",8));
        winners.add(CarDto.ofNameAndPosition("choi",8));
    }

    @Test
    public void setMaxPositionTest() {
        assertThat(RacingGameDto.setMaxPosition(cars)).isEqualTo(8);
    }

    @Test
    public void getWinnerNamesTest() {
        assertThat(RacingGameDto.getWinnerNames(cars)).isEqualTo("pobi,choi");
    }

    @Test
    public void getWinnersTest() {
        assertThat(RacingGameDto.getWinners(8, cars)).isEqualTo(winners);
    }
}
