import game.GameResult;
import game.InputView;
import game.RacingGame;
import game.ResultView;

public class RacingCarApplication {

    public static void main(String[] args) {
        int carNo = InputView.getCarNo();
        int tryNo = InputView.getTryNo();

        RacingGame racingGame = new RacingGame(carNo);
        GameResult gameResult = racingGame.move(tryNo);

        ResultView.print(gameResult);
    }
}
