package racing;

import racing.player.Car;
import racing.result.GameResult;
import racing.result.MoveResult;

import java.util.*;

public class RacingGame {
    private static final int SUFFICIENT_SPEED = 4;

    protected List<Car> cars;

    public RacingGame(String carNames) {
        ready(carNames);
    }

    private void ready(String carNames) {
        cars = new ArrayList<>();
        for(String name: carNames.split(",")) {
            cars.add(new Car(name));
        }
    }

    public MoveResult move() {
        for(Car car: cars) {
            moveFoward(car);
        }

        MoveResult result = new MoveResult();
        result.setMoveResult(this.cars);
        return result;
    }

    private void moveFoward(Car car) {
        if (isSufficientSpeed()) {
            car.setPosition(++car.position);
        }
    }

    public GameResult finish() {
        GameResult gameResult = new GameResult();
        for(Car car: cars) {
            gameResult.ranking(car);
        }
        return gameResult;
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
