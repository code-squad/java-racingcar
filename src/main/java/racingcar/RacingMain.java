package racingcar;

public class RacingMain {
    public static void main(String[] args) {
        String carNames = InputView.getCarNames();
        int tryNo = InputView.getTryNo();

        RacingGame racingGame = new RacingGame(carNames);
        racingGame.racing(tryNo);

        ResultView.printResult(racingGame);
    }
}
