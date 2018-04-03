package racing;

import java.util.ArrayList;
import java.util.List;

public class MoveResult {
    public List<String> distances;

    public void setMoveResult(List<Integer> carPositions) {
        this.distances = new ArrayList<>();
        for(int position: carPositions) {
            this.distances.add(getDistance(position));
        }
    }

    protected static String getDistance(int position) {
        String distance = "";
        for (; position > 0; position--) {
            distance = distance.concat("-");
        }
        return distance;
    }
}
