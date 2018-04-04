package racinggame.view;

import java.util.List;

public interface ResultView {

    void beforeRacingGame();

    void printResult(List<GameResult> cars);

    void afterRacingGame(List<GameResult> cars);

}
