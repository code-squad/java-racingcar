package com.zingoworks.racing;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class RacingGameTest {

    @Test
    public void findWinners() {
        String[] carNames = {"a", "b", "c"};
        int tryNo = 0;
        RacingGame racingGame = new RacingGame(carNames);
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(racingGame.getCars()[0]);
        cars.add(racingGame.getCars()[1]);
        cars.add(racingGame.getCars()[2]);
        racingGame.racing(tryNo);
        Assert.assertEquals(cars, racingGame.findWinners());
    }
}