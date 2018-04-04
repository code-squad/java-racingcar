package racingcar.domain;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;
import static java.util.stream.Collectors.*;

public class RacingGameTest {
    @Test
    public void winners_tripMeter값이_같은지_테스트() {
        RacingGame racingGame = new RacingGame("test1", "test2", "test3");
        racingGame.play();
        List<Car> winners = racingGame.getWinner();

        // winners의 tripMeter값이 같은지 확인
        assertEquals(1, winners.stream()
                .map(car -> car.isTripMeter(1))
                .distinct()
                .count());
    }

    @Test
    public void winners보다_tripMeter_이상인_car없는지_테스트() {
        RacingGame racingGame = new RacingGame("test1", "test2", "test3");
        List<Car> resultCars = racingGame.play();
        Car aWinner = racingGame.getWinner().get(0);

        assertEquals(0, resultCars.stream()
                .filter(car -> car.getTripMeter() > aWinner.getTripMeter())
                .collect(toList())
                .size());
    }
    
    @Test
    public void getBestTripMeter테스트() {
        RacingGame racingGame = new RacingGame("test1", "test2", "test3");
        assertEquals(racingGame.getWinner().get(0).getTripMeter(), racingGame.getBestTripMeter());
    }
}
