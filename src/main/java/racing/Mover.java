package racing;

import java.util.ArrayList;
import java.util.List;

public class Mover {
    private DeciderToGo deciderToGo;

    public Mover(DeciderToGo deciderToGo) {
        this.deciderToGo = deciderToGo;
    }

    public List<Integer> generatePositions(GameConfiguration gameConfiguration) {
        int carCount = gameConfiguration.getCarCount();
        int tryCount = gameConfiguration.getTryCount();

        List<Integer> positions = new ArrayList<>();
        for (int i=0; i<carCount; i++) {
            positions.add(calculatePosition(tryCount));
        }
        return positions;
    }

    private Integer calculatePosition(int tryCount) {
        int position = 0;
        for (int i=0; i<tryCount; i++) {
            position = move(position);
        }
        return position;
    }

    int move(int position) {
        return move(deciderToGo.canWeGo(), position);
    }

    int move(boolean go, int position) {
        if (go) {
            position++;
        }

        return position;
    }
}
