package racingcar;

public class RacingMain {
    public static void main(String[] args) {
        String carNames = InputView.input();
        int tryNum = InputView.moveNumber();

        RacingGame rg = new RacingGame(carNames);
        rg.randomCamparison(tryNum);

        ResultView.printResult(rg);

    }
}

