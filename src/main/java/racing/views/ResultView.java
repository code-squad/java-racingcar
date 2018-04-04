package racing.views;

import racing.RacingGame;
import racing.result.GameResult;
import racing.result.MoveResult;

public class ResultView {

    private static void print(MoveResult result) {
        System.out.println("실행 결과");
        for (String distance : result.distances) {
            System.out.println(distance);
        }
        System.out.println();
    }

    private static void print(GameResult result) {
        System.out.println(result.getWinnerName() + "가 최종 우승했습니다.");
    }

    public static void main(String[] args) {
        String carNames = InputView.carNames();
        int tryNo = InputView.getTryNo();

        RacingGame racingGame = new RacingGame(carNames);
        for(;tryNo > 0; tryNo--) {
            MoveResult result = racingGame.move();
            ResultView.print(result);
        }

        print(racingGame.finish());
    }
}
