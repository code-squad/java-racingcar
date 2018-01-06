package racing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ResultView {
    private final RacingGame racingGame;

    private final char token;

    public ResultView(RacingGame racingGame, char token) {
        this.racingGame = racingGame;
        this.token = token;
    }

    public List<String> drawLines() {
        return racingGame.moveAllCars()
                         .stream()
                         .map(this::drawLine)
                         .collect(Collectors.toList());
    }

    private String drawLine(Integer i) {
        return repeatChar(token, i);
    }

    private String repeatChar(char c, Integer length) {
        char[] data = new char[length];
        Arrays.fill(data, c);
        return new String(data);
    }
}
