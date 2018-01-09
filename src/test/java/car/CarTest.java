package car;


import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CarTest {

    private Race race;

    @Before
    public void init(){
        race = new Race(3, 5,9,4);
    }

    @Test
    public void calculatePosition_테스트() {
        IntStream.range(0, 100000).forEach(
                i -> assertTrue(CarMoveCalculator.calculatePosition(9,4) <= 1)
        );
    }

    @Test
    public void isMoveAble_false_테스트(){
        IntStream.range(0,4).forEach(
                i-> assertFalse(CarMoveCalculator.isMovable(i,4))
        );
    }

    @Test
    public void isMoveAble_true_테스트(){
        IntStream.range(5,10000).forEach(
                i-> assertTrue(CarMoveCalculator.isMovable(i,4))
        );
    }

    @Test
    public void createCarBySize_테스트() {
        race = new Race(3, 5,9,4);
        assertEquals(race.getCars().size(), 3);
    }

    @Test
    public void move_plus_1_테스트(){
        Car car = new Car();
        car.move(1);
        assertEquals(car.getPosition(), 1);
    }
}
