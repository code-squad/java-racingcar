package racing;

import racing.player.Car;
import racing.result.GameResult;

import java.util.*;

public class RacingGame {
    public List<Car> cars;

    public RacingGame(String carNames) {
        ready(carNames);
    }

    private void ready(String carNames) {
        cars = new ArrayList<>();
        for(String name: carNames.split(",")) {
            cars.add(new Car(name));
        }
    }

    public GameResult nextTurn() {
        for(Car car: cars) {
            car.move(getRandomValue());
        }
        return new GameResult(cars);
    }

//    private static int getRandomValue() {
//        return new Random().nextInt(10);
//    }

    // 테스트용 공정 데이터 테스트 후 주석처리
    private static int[] random = {2, 4, 1, 1, 8, 9, 4, 9, 3, 6, 3, 4, 3, 9, 0, 6, 1, 8, 6, 6, 3, 1, 1, 7, 7, 8, 7, 7, 1, 2, 4, 4};
    private static int count = 0 ;
    @SuppressWarnings("WeakerAccess")
    protected static int getRandomValue() {
        return random[count++];
    }
}
