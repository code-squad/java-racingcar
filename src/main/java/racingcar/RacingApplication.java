package racingcar;

public class RacingApplication {
    public static void main(String[] args) {
        RacingGameInfoDTO gameInfo = InputView.inputDataAndView();
        RacingGame rc = new RacingGame(gameInfo);

        for (int count = 0; count < gameInfo.getTestCase(); count++) {
            int[] carPosition = rc.moveCar();
            ResultView.printStatus(carPosition);
        }
    }
}
