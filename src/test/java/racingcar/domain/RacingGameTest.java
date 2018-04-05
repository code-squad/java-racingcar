package racingcar.domain;

import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.*;
import static java.util.stream.Collectors.*;

public class RacingGameTest {
    private RacingGame racingGame;
    
    @Before
    public void setUp() {
        racingGame = new RacingGame(new RandomRule(),"test1", "test2", "test3");
    }
    
    @Test
    public void winners_tripMeter값이_같은지_테스트() {
        racingGame.play();
        List<Car> winners = racingGame.getWinner();

        // winners의 tripMeter값이 같은지 확인
        assertThat(winners.stream()
                .map(car -> car.isTripMeter(1))
                .distinct()
                .count())
                .isEqualTo(1);
    }

    @Test
    public void winners보다_tripMeter_이상인_car없는지_테스트() {
        List<Car> resultCars = racingGame.play();
        Car aWinner = racingGame.getWinner().get(0);

        assertThat(resultCars.stream()
                .filter(car -> car.getTripMeter() > aWinner.getTripMeter())
                .collect(toList())
                .size())
                .isEqualTo(0);
    }
    
    @Test
    public void getBestTripMeter테스트() {
        assertThat(racingGame.getWinner().get(0).getTripMeter())
                .isEqualTo(racingGame.getBestTripMeter());
    }
}
