package car;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class CarTest {

    private Race race;
    private List cars;
    private Car car;

    @Before
    public void init(){
        cars = new ArrayList(){{
            add(new Car("car1",1));
            add(new Car("car2",3));
            add(new Car("car3",2));
        }};
        race = new Race(cars, 5);
        car = new Car("pobi",0);
    }

    @Test
    public void calculatePosition_테스트() {
        IntStream.range(0, 100000).forEach(
                i -> assertTrue(car.calculateIsPossibleGoForward(9,4) <= 1)
        );
    }

    @Test
    public void isMoveAble_false_테스트(){
        IntStream.range(0,4).forEach(
                i-> assertFalse(car.isMovable(i,4))
        );
    }

    @Test
    public void isMoveAble_true_테스트(){
        IntStream.range(5,10000).forEach(
                i-> assertTrue(car.isMovable(i,4))
        );
    }

    @Test
    public void move_plus_1_테스트(){
        car.move(9,0);

        assertEquals(car.getPosition(), 1);
    }

    @Test
    public void calCulateWinners_우승자1명_테스트(){
        List<Car> cars = new ArrayList(){{
            add(new Car("car1",1));
            add(new Car("car2",3));
            add(new Car("car3",2));
        }};

        List<Car> winners = race.calCulateWinners(cars);

        assertEquals("car2", winners.get(0).getName());
        assertEquals(3, winners.get(0).getPosition());
    }

    @Test
    public void calCulateWinners_우승자여러명_테스트(){
        List<Car> cars = new ArrayList(){{
            add(new Car("car1",3));
            add(new Car("car2",3));
            add(new Car("car3",3));
        }};

        List<Car> winners = race.calCulateWinners(cars);

        assertEquals("car1", winners.get(0).getName());
        assertEquals(3, winners.get(0).getPosition());
        assertEquals("car2", winners.get(1).getName());
        assertEquals(3, winners.get(1).getPosition());
        assertEquals("car3", winners.get(2).getName());
        assertEquals(3, winners.get(2).getPosition());

    }
}
