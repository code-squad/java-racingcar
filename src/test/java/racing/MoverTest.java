package racing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MoverTest {
    private Mover mover = new Mover(new SimpleDeciderToGo());

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getMoveList() throws Exception {
        for (int i=10; i<1000; i++) {
            checkMove(2, i);
            checkMove(20, i);
            checkMove(200, i);
        }
    }

    private void checkMove(int carCount, int i) {
        List<Integer> moveList = mover.getMoveList(new GameConfiguration(carCount, i));

        if (moveList.size() != carCount) {
            assertTrue(false);
        }

        for (Integer move : moveList) {
            checkMaxMove(i, move);
        }
    }

    private void checkMaxMove(int i, Integer move) {
        if (move > i) {
            assertTrue(false);
        }
    }

}