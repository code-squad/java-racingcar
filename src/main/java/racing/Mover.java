package racing;

import java.util.ArrayList;
import java.util.List;

public class Mover {
    private DeciderToGo deciderToGo;

    public Mover(DeciderToGo deciderToGo) {
        this.deciderToGo = deciderToGo;
    }

    List<Integer> getMoveList(GameConfiguration gameConfiguration) {
        List<Integer> moveList = new ArrayList<>();
        for (int i=0; i<gameConfiguration.getCarCount(); i++) {
            moveList.add(calcEachCarMovement(gameConfiguration.getTryCount()));
        }

        return moveList;
    }

    private Integer calcEachCarMovement(int tryCount) {
        int movement = 0;
        for (int i=0; i<tryCount; i++) {
            movement = deciderToGo.moveOrStop(movement);
        }

        return movement;
    }

}
