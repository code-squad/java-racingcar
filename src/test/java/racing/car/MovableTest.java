package racing.car;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Moonchan on 2018. 1. 8..
 */
public class MovableTest {
    @Test
    public void alwaysMove() {
        Movable movable = () -> true;
        assertTrue(movable.move());
    }

    @Test
    public void neverMove() {
        Movable movable = () -> false;
        assertFalse(movable.move());
    }

}