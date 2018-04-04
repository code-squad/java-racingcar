package racingcar;

public class RacingApplication {
    public static void main(String[] args) {
        RacingGame rc = new RacingGame(InputView.inputNameOfCar());
        int testCase = InputView.inputTestCase();

        GameResult gameResult = null;
        for (int count = 0; count < testCase; count++) {
            gameResult = rc.moveCar();
            ResultView.printStatus(gameResult);
        }
        ResultView.printWinner(gameResult.getCarRacingWinner());
    }
}
