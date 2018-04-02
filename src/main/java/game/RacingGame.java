package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingGame {

    private int time;
    private List<Car> cars;
    private GameRule gameRule;
    private View view;

    public static RacingGame newInstance() {
        RacingGame racingGame = new RacingGame();
        racingGame.view = View.newInstance();
        racingGame.time = racingGame.view.inputTime();
        racingGame.cars = racingGame.initCars(racingGame.view.inputCarCount());
        racingGame.gameRule = new GameRule();
        return racingGame;
    }

    public static RacingGame of(int time, int carCount) {
        RacingGame racingGame = new RacingGame();
        racingGame.view = View.newInstance();
        racingGame.time = time;
        racingGame.cars = racingGame.initCars(carCount);
        racingGame.gameRule = new GameRule();
        return racingGame;
    }

    List<Car> initCars(int carCount) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < carCount; i++) {
            cars.add(Car.of(GameRule.START_POSITION));
        }
        return cars;
    }

    public void start() {
        System.out.println("\n실행 결과");
        play();
    }

    private void play() {
        for (int i = 0; i < time; i++) {
            round();
            view.print(cars);
        }
    }

    private void round() {
        final Random random = new Random();

        cars.forEach(car -> {
            int randomValue = random.nextInt(GameRule.MAX_RANDOM_VALUE);

            if (gameRule.canMove(randomValue)) {
                car.move();
            }
        });
    }

    private RacingGame() {}
}
