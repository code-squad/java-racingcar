package racing;

import racing.speed.Speed;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private static final int BASIC_NUMBER_OF_TIME = 5;
    private static final int BASIC_NUMBER_OF_CAR = 3;

    private static final int SUFFICIENT_SPEED = 4;

    public int time;
    public List<Integer> carPositions;
    public Speed speed;

    public RacingGame(Speed speed) {
        this(speed, BASIC_NUMBER_OF_TIME, BASIC_NUMBER_OF_CAR);
    }

    public RacingGame(Speed speed, int time, int numberOfCar) {
        this.speed = speed;
        this.time = time;
        setCarPositions(numberOfCar);
    }

    private void setCarPositions(int numberOfCar) {
        this.carPositions = new ArrayList();
        for (; numberOfCar > 0; numberOfCar--) {
            this.carPositions.add(1);
        }
    }

    public void bbang() {
        carPositionSnapshot();
        for (; time > 0; time--) {
            racing();
            carPositionSnapshot();
        }
    }

    public void racing() {
        for (int i = 0; i < carPositions.size(); i++) {
            forward(i);
        }
    }

    public void forward(int idx) {
        if (canIGo()) {
            carPositions.set(idx, carPositions.get(idx) + 1);
        }
    }

    public boolean canIGo() {
        return speed.fullAccel() >= SUFFICIENT_SPEED;
    }

    public void carPositionSnapshot() {
        String snapshot = "";
        for (Integer position : carPositions) {
            snapshot = snapshot.concat(getDistance(position));
            snapshot = snapshot.concat("\n\r");
        }
        System.out.println(snapshot);
    }

    public static String getDistance(int position) {
        String distance = "";
        for (; position > 0; position--) {
            distance = distance.concat("-");
        }
        return distance;
    }
}
