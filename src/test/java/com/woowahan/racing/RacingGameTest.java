package com.woowahan.racing;

import com.woowahan.racing.Car;
import com.woowahan.racing.RacingGame;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RacingGameTest {

    private RacingGame racingGame;

    @Before
    public void 초기설정() {
        String[] names = {"pobi", "crong", "honux"};

        racingGame = new RacingGame(names, 4);
    }

    @Test
    public void 자동차생성() {
        racingGame.start();
        assertEquals(3, racingGame.getCars().size());
    }

    @Test
    public void 한명일때_이름찍기() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("pobi", 8));

        assertEquals("pobi", RacingGame.getCarsName(cars));
    }

    @Test
    public void 두명일때_이름찍기() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("pobi", 8));
        cars.add(new Car("honux", 8));

        assertEquals("pobi, honux", racingGame.getCarsName(cars));
    }

    @Test
    public void 인자포지션과_같은_포지션인_자동차리스트_가져오기() {
        Car pobi = new Car("pobi", 8);
        Car crong = new Car("crong", 8);
        Car honux = new Car("honux", 3);

        List<Car> cars = new ArrayList<>();
        cars.add(pobi);
        cars.add(crong);
        cars.add(honux);

        List<Car> expected = new ArrayList<>();
        expected.add(pobi);
        expected.add(crong);

        assertEquals(expected, RacingGame.getMatchPositionCar(cars, 8));
    }

    @Test
    public void 차의_포지션과_포지션이같으면_add() {
        List<Car> cars = new ArrayList<>();

        Car car = new Car("car", 7);
        int position = 7;

        RacingGame.addMatchCar(position, cars, car);

        assertTrue(cars.contains(car));
    }

    @Test
    public void 차의_포지션과_포지션이다르면_add안함() {
        List<Car> cars = new ArrayList<>();

        Car car = new Car("car", 7);
        int position = 8;

        RacingGame.addMatchCar(position, cars, car);

        assertTrue(!cars.contains(car));
    }

    @Test
    public void 리스트에서_가장_높은_포지션_구하기() {
        List<Car> cars = new ArrayList<>();

        Car car1 = new Car("끼룩", 28);
        Car car2 = new Car("Boobby", 27);
        Car car3 = new Car("세환", 25);
        Car car4 = new Car("예준", 27);
        Car car5 = new Car("한나", 27);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        assertEquals(28, RacingGame.getMaxPosition(cars));
    }
}
