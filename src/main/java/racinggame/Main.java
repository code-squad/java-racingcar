package racinggame;

import racinggame.domain.Car;
import racinggame.domain.RacingGame;
import racinggame.view.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        InputView inputView = new DefaultInputView();

        List<String> carNames = inputView.initCarNames();
        int tryCount = inputView.initRacingGameTryCount();

        RacingGame racingGame = new RacingGame(carNames);
        ResultView resultView = new DefaultResultView();

        resultView.beforeRacingGame();
        List<GameResult> gameResults = doRacingGame(racingGame, resultView, tryCount);
        resultView.afterRacingGame(gameResults);
    }

    private static List<GameResult> doRacingGame(RacingGame racingGame, ResultView resultView, int tryCount) {
        List<GameResult> gameResults = new ArrayList<>();

        for (int i=0; i<tryCount; i++) {
            racingGame.start();
            gameResults = toRacingGameResult(racingGame.getCars());
            resultView.printResult(gameResults);
        }

        return gameResults;
    }

    private static List<GameResult> toRacingGameResult(List<Car> cars) {
        return cars.stream()
                .map(Main::apply)
                .collect(Collectors.toList());
    }

    private static GameResult apply(Car car) {
        return new GameResult(car.getName(), car.getPosition());
    }
}