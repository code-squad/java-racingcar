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
            checkMove(2, i);
            checkMove(20, i);
            checkMove(200, i);
        }
        assertTrue(true);
    }

    private void checkMove(int carCount, int i) {
        List<Integer> moveList = mover.generatePositions(new GameConfiguration(carCount, i));

        assertTrue(moveList.size() == carCount);

        for (Integer move : moveList) {
            checkMaxMove(i, move);
        }
    }

    private void checkMaxMove(int i, Integer move) {
        if (move > i) {
            assertTrue(false);
        }
    }

    @Test
    public void move() throws Exception {
        assertEquals(10, mover.move(true, 9));
        assertEquals(9, mover.move(false, 9));
    }
}