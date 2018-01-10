package game;

import car.Car;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class RacingGameTest {
    private RacingGame rg;
    private List<Car> cars;

    @Before
    public void setup(){
        rg = new RacingGame("car1,car2", 1);
        cars = rg.getCars();
        cars.get(0).move(5);
    }

    @Test
    public void findWinner() {
        assertEquals("car1", rg.findWinner());
        cars.get(1).move(5);
        cars.get(1).move(5);
        assertEquals("car2", rg.findWinner());
    }

    @Test
    public void findTopPosition(){
        assertEquals(1, rg.findTopPosition());
        cars.get(0).move(5);
        assertEquals(2, rg.findTopPosition());
    }
}
