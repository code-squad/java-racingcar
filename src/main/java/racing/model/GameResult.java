package racing.model;

import java.util.List;

public class GameResult {
    private List<String> gameResult;
    private String gameWinnerResult;

    public GameResult(List<String> gameResult, String gameWinnerResult) {
        this.gameResult = gameResult;
        this.gameWinnerResult = gameWinnerResult;
    }

    public List<String> getGameResult() {
        return gameResult;
    }

    public String getGameWinnerResult() {
        return gameWinnerResult;
    }
}
