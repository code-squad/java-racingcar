package racing;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MoverTest {
    private Mover mover;

    @Before
    public void setUp() throws Exception {
        mover = new Mover(new SimpleDeciderToGo());
    }

    @Test
    public void getMoveList() throws Exception {
        for (int i=10; i<1000; i++) {
            assertTrue(checkMove(2, i));
            assertTrue(checkMove(20, i));
            assertTrue(checkMove(200, i));
        }
    }

    private boolean checkMove(int carCount, int i) {
        List<Integer> moveList = mover.generatePositions(new GameConfiguration(carCount, i));

        assertTrue(moveList.size() == carCount);

        for (Integer move : moveList) {
            checkMaxMove(i, move);
        }

        return true;
    }

    private void checkMaxMove(int i, Integer move) {
        assertFalse(move > i);
    }

    @Test
    public void move() throws Exception {
        assertEquals(10, mover.move(true, 9));
        assertEquals(9, mover.move(false, 9));
    }
}