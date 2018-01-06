package racing;

import java.util.List;

import static racing.RacingResultUtils.getBestCarNames;

public class ResultView {
    private final RacingGame racingGame;

    public ResultView(RacingGame racingGame) {
        checkArguments(racingGame);
        this.racingGame = racingGame;
    }

    public void showResult() {
        List<RacingResult> results = racingGame.doRacing();

        showAllCarResult(results);
        showBestCarResult(results);
    }

    private void showBestCarResult(List<RacingResult> results) {
        System.out.println(getBestCarNames(results) + "가 최종 우승하였습니다");
    }

    private void showAllCarResult(List<RacingResult> results) {
        results.forEach(result -> System.out.println(result.getResult()));
    }

    private void checkArguments(RacingGame racingGame) {
        if (racingGame == null) {
            throw new IllegalArgumentException("racingGame should not be null");
        }
    }
}
