package racing;

import java.util.ArrayList;
import java.util.List;

public class Mover {
    private DeciderToGo deciderToGo = new SimpleDeciderToGo();

    List<Integer> getMoveList(int carCount, int tryCount) {
        List<Integer> moveList = new ArrayList<>();
        for (int i=0; i<carCount; i++) {
            moveList.add(calcEachCarMovement(tryCount));
        }

        return moveList;
    }

    private Integer calcEachCarMovement(int tryCount) {
        int movement = 0;
        for (int i=0; i<tryCount; i++) {
            boolean canWeGo = deciderToGo.canWeGo();
            movement = deciderToGo.moveOrStop(canWeGo, movement);
        }

        return movement;
    }
}
