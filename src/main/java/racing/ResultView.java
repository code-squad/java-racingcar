import java.util.Arrays;
import java.util.List;

public class ResultView {
    private final RacingGame racingGame;

    private final char token;

    public ResultView(RacingGame racingGame, char token) {
        this.racingGame = racingGame;
        this.token = token;
    }

    public void print() {
        List<Integer> result = racingGame.move();

        result.forEach(this::drawLine);
    }

    private void drawLine(Integer i) {
        System.out.println(repeatChar(token, i));
    }

    private String repeatChar(char c, Integer length) {
        char[] data = new char[length];
        Arrays.fill(data, c);
        return new String(data);
    }
}
