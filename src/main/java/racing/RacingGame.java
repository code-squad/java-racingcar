package racing;

import java.util.List;

public class RacingGame {
    private InputView inputView;
    private ResultView resultView;
    private Mover mover;

    public RacingGame(DeciderToGo deciderToGo) {
        this.inputView = new InputView();
        this.resultView = new ResultView();
        this.mover = new Mover(deciderToGo);
    }

    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame(new SimpleDeciderToGo());
        racingGame.startGame();
    }

    private void startGame() {
        GameConfiguration gameConfiguration = inputView.requestToInput();

        List<Integer> moveList = mover.getMoveList(gameConfiguration);

        resultView.showGameResult(moveList);
    }
}
