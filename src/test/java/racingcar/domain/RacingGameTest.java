package racingcar.domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RacingGameTest {
    @Test
    public void getWinner테스트() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("jang", 5));
        cars.add(new Car("so", 3));
        cars.add(new Car("hyun", 5));

        List<Car> winners = RacingGame.getWinner();
        Assert.assertEquals("jang/hyun", winners.stream()
                                                            .map(winner -> winner.getName())
                                                            .reduce((s, s2) -> s+"/"+s2));
    }
}
