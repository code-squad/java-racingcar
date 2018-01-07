package racinggame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    private Car car;

    @Before
    public void setUp() throws Exception {
        car = new Car();
    }

    @Test
    public void move_back() {
        assertEquals(0, car.move(3));
    }

    @Test
    public void move_forward() {
        assertEquals(1, car.move(4));
    }

    @Test
    public void getResult(){
        move_two_step();
        assertEquals("--", car.getResult(car.getPosition()));
    }

    @Test
    public void getPosition(){
        move_two_step();
        assertEquals(2, car.getPosition());
    }

    private void move_two_step() {
        car.move(5);
        car.move(6);
        car.move(2);
    }

    private void java8 (){

    }
}