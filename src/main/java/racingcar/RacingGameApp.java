package racingcar;

public class RacingGameApp {

    public static void main(String[] args) {
        startRacingGame();
    }

    public static void startRacingGame(){
        RacingGame racingGame = createRacingGame(InputView.getInputCarCnt());
        int racingCnt = InputView.getInputTimeCnt();

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < racingCnt; i++) {
            OutputView.addGameResult(racingGame.move(),result);
        }

        OutputView.drawResult(result.toString());

    }

    public static RacingGame createRacingGame(int carCnt){
        return new RacingGame(carCnt);
    }
}
