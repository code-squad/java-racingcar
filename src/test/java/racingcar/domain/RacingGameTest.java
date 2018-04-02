package racingcar.domain;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class RacingGameTest {
    @Test
    public void getWinner테스트() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("jang", 5));
        cars.add(new Car("so", 3));
        cars.add(new Car("hyun", 5));

        RacingGame racingGame = new RacingGame();
        Method initCarsMethod = racingGame.getClass()
                .getDeclaredMethod("initCars", List.class);
        initCarsMethod.setAccessible(true);
        initCarsMethod.invoke(racingGame, cars);

        List<Car> winners = racingGame.getWinner();
        Assert.assertEquals("jang,hyun", winners.stream()
                                                            .map(winner -> winner.getName())
                                                            .reduce((s, s2) -> s.concat(",").concat(s2))
                                                            .get());
    }
}
