package racingcar;

public class RacingApplication {
    public static void main(String[] args) {
        int countOfCar = InputView.inputCountOfCar();
        int testCase = InputView.inputTestCase();
        RacingGame rc = new RacingGame(countOfCar);

        for (int count = 0; count < testCase; count++) {
            int[] carPosition = rc.moveCar();
            ResultView.printStatus(carPosition);
        }
    }
}
