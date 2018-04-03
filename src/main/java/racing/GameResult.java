package racing;

import java.util.List;

public class GameResult {
    List<Integer> carPositions;

    public void snapshot(List<Integer> carPositions) {
        this.carPositions = carPositions;
    }

    private static String getDistance(int position) {
        String distance = "";
        for (; position > 0; position--) {
            distance = distance.concat("-");
        }
        return distance;
    }

    @Override
    public String toString() {
        String result = "";
        for (int position : carPositions) {
            result = result.concat(getDistance(position));
            result = result.concat("\n\r");
        }

        return result;
    }
}
