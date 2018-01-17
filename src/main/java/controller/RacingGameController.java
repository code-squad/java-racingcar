package controller;

import model.Car;
import model.RacingGame;
import view.ConsoleView;
import view.RacingGameView;

import java.util.ArrayList;
import java.util.List;

import static spark.Spark.get;

public class RacingGameController {
    private RacingGameView view;
    private RacingGame racingGame;

    public RacingGameController() {
        view = new ConsoleView();

        String[] carNames = view.askCarCount();
        int racingCount = view.askRacingCount();

        List<Car> cars = initCars(carNames);

        racingGame = new RacingGame(racingCount, cars);

        MainRouting mainRouting = new MainRouting(racingGame);
        mainRouting.onGame();
        mainRouting.onIndex();
        mainRouting.onResult(); 
    }

    public void run() {
        racingGame.runGames();
        view.printCarPositions(racingGame.getCars(), racingGame.getWinners());
    }



    public List<Car> initCars(String[] carNames) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < carNames.length; i++) {
            cars.add(new Car(carNames[i]));
        }
        return cars;
    }
}
