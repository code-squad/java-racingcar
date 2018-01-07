package racing;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MoverTest {
    private Mover mover;

    @Test
    public void getMoveList() throws Exception {
        mover = new Mover(new SimpleDeciderToGo());

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
        // Replace with lambda : 아래 주석은 메모로 남겨둠
//        mover = new Mover(new DeciderToGo() {
//            @Override
//            public boolean canWeGo() {
//                return true;
//            }
//        });

        mover = new Mover(() -> true);
        assertEquals(10, mover.move( 9));

        mover = new Mover(() -> false);
        assertEquals(9, mover.move(9));
    }
}