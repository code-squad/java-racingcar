package racingcar.domain;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;
import static java.util.stream.Collectors.*;

public class RacingGameTest {
    @Test
   /* public void winners_tripMeter값이_같은지_테스트() {
        RacingGame racingGame = new RacingGame("test1", "test2", "test3");
        racingGame.play();
        List<Car> winners = racingGame.getWinner();

        // winners의 tripMeter값이 같은지 확인
        assertEquals(1, winners.stream()
                .map(car -> car.isTripMeter(1))
                .distinct()
                .count());
    }*/

    @Test
    public void winners보다_tripMeter_이상인_car없는지_테스트() {
        /*RacingGame racingGame = new RacingGame("test1", "test2", "test3");
        List<Car> resultCars = racingGame.play();
        List<Car> winners = racingGame.getWinner();

        int winnerTripMeter = winners.stream()
                .map(Car::getTripMeter)
                .findAny()
                .get();
        
        assertEquals(0, resultCars.stream()
                .filter(car -> !winners.stream()
                        .filter(winner -> winner.getName() == car.getName())
                        .findAny()
                        .isPresent())
                .filter(car -> car.getTripMeter() >= winnerTripMeter)
                .collect(toList())
                .size());*/
    }
}
