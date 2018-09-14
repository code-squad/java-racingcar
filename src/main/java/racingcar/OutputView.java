package racingcar;

import java.util.ArrayList;
import java.util.Map;

public class OutputView {
    private static final String WINNER_SEPARATE_FACTOR = ",";
    private static final String RESULT_SEPARATE_FACTOR = " : ";
    private static final String DASH = "-";
    private String result;
    private String winner;

    public OutputView(ArrayList<Result> result, ArrayList<String> winner) {
        this.result = resultParser(result);
        this.winner = winnerParser(winner);
    }

    public void print() {
        System.out.println(result);
        System.out.println(winner);
    }

    public String winnerParser(ArrayList<String> array) {
        StringBuilder sb = new StringBuilder();
        for (String s : array) {
            sb.append(s);
            sb.append(WINNER_SEPARATE_FACTOR);
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public String resultParser(ArrayList<Result> resultList) {
        StringBuilder sb = new StringBuilder();
        for (Result result : resultList) {
            sb.append(result.getName());
            sb.append(RESULT_SEPARATE_FACTOR);
            positionToDash(result.getPosition(), sb);
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    private void positionToDash(int position, StringBuilder sb) {
        for (int i = 0; i < position; i++) {
            sb.append(DASH);
        }
    }
}
