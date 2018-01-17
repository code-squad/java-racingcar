package controller;

import model.Car;
import model.RacingGame;
import view.ConsoleView;
import view.RacingGameView;

import java.util.ArrayList;
import java.util.List;

public class RacingGameController {
    private RacingGameView consoleView;
    private RacingGame racingGame;

    public RacingGameController() {
        consoleView = new ConsoleView();

        String[] carNames = consoleView.askCarCount();
        int racingCount = consoleView.askRacingCount();

        List<Car> cars = initCars(carNames);

        racingGame = new RacingGame(racingCount, cars);
    }

    public void run() {
        racingGame.runGames();
        consoleView.printCarPositions(racingGame.getCars(), racingGame.getWinners());
    }

    public List<Car> initCars(String[] carNames) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < carNames.length; i++) {
            cars.add(new Car(carNames[i]));
        }
        return cars;
    }
}
