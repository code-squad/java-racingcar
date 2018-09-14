package io.github.oraindrop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
    Car c1;
    Car c2;

    @Before
    public void setUpTest(){
        c1 = new Car("choising");
        c2 = new Car("pobi");
    }

    @Test
    public void decideForwardTest(){
        assertTrue(c1.getScore() == 0);
        assertTrue(c2.getScore() == 0);

        c1.decideForward(5);
        assertEquals(1, c1.getScore());

        c1.decideForward(3);
        assertEquals(1, c1.getScore());

        c1.decideForward(1);
        assertEquals(1, c1.getScore());

        c1.decideForward(8);
        assertEquals(2, c1.getScore());
    }

    @Test
    public void compareTest(){
        decideForwardTest();
        assertEquals(-1, c1.compareTo(c2));
    }
}
