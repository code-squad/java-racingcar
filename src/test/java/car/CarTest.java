package car;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CarTest {

    private Race race;
    private List carNames;
    private Car car;

    @Before
    public void init(){
        carNames = new ArrayList(){{
            add("류광현차");
            add("조정훈차");
            add("강지선차");
        }};
        race = new Race(carNames, 5);
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
    public void createCars_테스트() {
        race = new Race(carNames, 5);

        assertEquals(race.getCars().size(), 3);
    }

    @Test
    public void move_plus_1_테스트(){
        car.move(9,0);

        assertEquals(car.getPosition(), 1);
    }

    @Test
    public void calCulateWinners_우승자1명_테스트(){
        ArrayList cars = new ArrayList(){{
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
