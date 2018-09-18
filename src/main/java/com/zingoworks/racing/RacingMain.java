package com.zingoworks.racing;

public class RacingMain {
    public static void main(String[] args) {
        String[] carNames = InputView.getCarsName();
        int tryNo = InputView.getTrials();

        RacingGame racingGame = new RacingGame(carNames);
        racingGame.racing(tryNo);

        ResultView.printResult(racingGame);
    }
}