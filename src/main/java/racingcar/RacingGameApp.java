package racingcar;

public class RacingGameApp {

    public static void main(String[] args) {
        startRacingGame();
    }

    public static void startRacingGame(){
        RacingGame racingGame = createRacingGame();

        int racingCnt = InputView.getInputTimeCnt();
        for(int i = 0; i < racingCnt; i++) {
            OutputView.printRacingResult(racingGame.move());
        }

        OutputView.printWinners(racingGame.getWinnnersRacing());
    }

    public static RacingGame createRacingGame(){
        return new RacingGame(splitNames(InputView.getInputCarNames()));
    }

    public static String[] splitNames(String inputName) {
        return inputName.split(",");
    }

}
