package racing;

import java.util.List;

public class RacingGame {
    private InputView inputView = new InputView();
    private ResultView resultView = new ResultView();
    private Mover mover = new Mover();

    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        racingGame.startGame();
    }

    private void startGame() {
        GameConfiguration gameConfiguration = inputView.requestToInput();

        List<Integer> moveList = mover.getMoveList(gameConfiguration.getCarCount(), gameConfiguration.getTryCount());

        resultView.showGameResult(moveList);
    }
}
