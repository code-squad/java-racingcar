package racingcar;

public class RacingMain {
    public static void main(String[] args) {
        String carNames = InputView.getNames();
        int tryNo = InputView.getMovingCount();

        RacingGame racingGame = new RacingGame(carNames);
        racingGame.run(tryNo);

        ResultView.printResult(racingGame);
    }
}
