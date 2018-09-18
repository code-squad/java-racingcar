package racingcar;

public class RacingGameMain {
    public static void main(String[] args) {
        String[] users = InputView.userName();
        int time = InputView.time();

        RacingGame game = new RacingGame(users);
        game.move(time);
        ResultView.printResult(game);
    }
}
