package io.github.oraindrop;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class RacingTest {
    Racing r;

    @Before
    public void setUp(){
        r = new Racing();
        r.readyRace("pobi,choising,forever");
        // choising과 forever를 우승자로 셋팅
        r.getCars().get(0).decideForward(5);
        r.getCars().get(1).decideForward(5);
        r.getCars().get(1).decideForward(5);
        r.getCars().get(2).decideForward(5);
        r.getCars().get(2).decideForward(5);
    }

    @Test
    public void mainTest(){
        // 우승자는 2명?
        assertEquals(2, r.pickWinner().size());

        assertEquals("choising", r.pickWinner().get(0));
        assertEquals("forever", r.pickWinner().get(1));
    }

}
