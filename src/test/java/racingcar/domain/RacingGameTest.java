package racingcar.domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class RacingGameTest {
    @Test
    public void winners_tripMeter값이_같은지_테스트() {
        RacingGame racingGame = new RacingGame();
        List<Car> resultCars = racingGame.play(3,5);
        List<Car> winners = racingGame.getWinner();

        // winners의 tripMeter값이 같은지 확인
        Assert.assertEquals(1, winners.stream()
                .map(winner -> winner.getTripMeter())
                .distinct()
                .count());
    }

    @Test
    public void winners보다_tripMeter_이상인_car없는지_테스트() {
        RacingGame racingGame = new RacingGame();
        List<Car> resultCars = racingGame.play(3,5);
        List<Car> winners = racingGame.getWinner();

        int winnerTripMeter = winners.stream()
                .map(winner -> winner.getTripMeter())
                .findAny()
                .get();
        Assert.assertEquals(0, resultCars.stream()
                .filter(car -> !winners.stream()
                        .filter(winner -> winner.getName() == car.getName())
                        .findAny()
                        .isPresent())
                .filter(car -> car.getTripMeter() >= winnerTripMeter)
                .collect(Collectors.toList())
                .size());
    }
}
