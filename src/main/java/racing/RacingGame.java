package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingGame {
    private static final int SUFFICIENT_SPEED = 4;

    protected List<Integer> carPositions;

    public RacingGame(int numberOfCar) {
        ready(numberOfCar);
    }

    private void ready(int numberOfCar) {
        this.carPositions = new ArrayList<>();
        for (; numberOfCar > 0; numberOfCar--) {
            this.carPositions.add(1);
        }
    }

    public MoveResult move() {
        for (int i = 0; i < carPositions.size(); i++) {
            moveFoward(i);
        }
        MoveResult result = new MoveResult();
        result.setMoveResult(this.carPositions);
        return result;
    }

    private void moveFoward(int idx) {
        if (isSufficientSpeed()) {
            carPositions.set(idx, carPositions.get(idx) + 1);
        }
    }

    protected static boolean isSufficientSpeed() {
        return fullAccel() >= SUFFICIENT_SPEED;
    }

    private static int fullAccel() {
        return new Random().nextInt(10);
    }

    // 테스트용 공정 데이터 테스트 후 주석처리
//    private static int[] random = {2, 4, 1, 1, 8, 9, 4, 9, 3, 6, 3, 4, 3, 9, 0, 6, 1, 8, 6, 6, 3, 1, 1, 7, 7, 8, 7, 7, 1, 2, 4, 4};
//    private static int count = 0 ;
//    protected static int fullAccel() {
//        return random[count++];
//    }


}
