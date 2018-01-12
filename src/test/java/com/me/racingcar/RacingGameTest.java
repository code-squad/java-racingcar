package com.me.racingcar;

import com.me.racingcar.game.racing.Car;
import com.me.racingcar.game.racing.RacingGame;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RacingGameTest {
    /**
     * STEP1:
     * 초간단 자동차 경주 게임을 구현한다.
     * 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
     * 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
     * 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
     * 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.
     *
     * STEP2:
     * 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
     * 자동차 이름은 쉼표(,)를 기준으로 구분한다.
     * 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.
     */

    @Test
    public void game01(){
        RacingGame game = new RacingGame(8, 100);
        List<Car> cars = game.start();
        RacingGame.viewResult(cars);
    }

    @Test
    public void game02(){
        RacingGame game = new RacingGame("han,kim,park,jin", 100);
        List<Car> cars = game.start();
        RacingGame.viewResult(cars);
    }

    @Test
    public void game02_get_winner(){
        List<Car> cars = new ArrayList<>();
        Car car01 = new Car("test-01");
        car01.setPosition(5);
        cars.add(car01);
        Car car02 = new Car("test-02");
        car02.setPosition(10);
        cars.add(car02);

        List<Car> winner = RacingGame.getWinner(cars);
        assertTrue(1 == winner.size());
    }

    @Test
    public void game02_get_winner_not_one(){
        List<Car> cars = new ArrayList<>();
        Car car01 = new Car("test-01");
        car01.setPosition(5);
        cars.add(car01);
        Car car02 = new Car("test-02");
        car02.setPosition(10);
        cars.add(car02);
        Car car03 = new Car("test-03");
        car03.setPosition(10);
        cars.add(car03);

        List<Car> winner = RacingGame.getWinner(cars);
        assertTrue(2 == winner.size());

    }

    @Test
    public void game02_car_one(){
        RacingGame game = new RacingGame("han", 100);
        List<Car> cars = game.start();
        RacingGame.viewResult(cars);
    }

    @Test(expected = IllegalArgumentException.class)
    public void game_start_car_under_zero(){
        new RacingGame(0, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void game_start_term_under_zero(){
        new RacingGame(10, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void game_start_car_name_empty(){
        new RacingGame("", 100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void game_start_car_only_separator(){
        RacingGame game = new RacingGame(",", 100);
        List<Car> cars = game.start();
        RacingGame.viewResult(cars);
    }

}