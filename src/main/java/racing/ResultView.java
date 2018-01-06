package racing;

import java.util.List;

public class ResultView {
    void showGameResult(List<Integer> moveList) {
        for (Integer move : moveList) {
            showGameResult(move);
        }
    }

    private void showGameResult(int move) {
        for (int i=0; i<move; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }
}
