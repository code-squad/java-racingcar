package racinggame;

import java.util.List;

public class DefaultRacingGameView implements RacingGameView {

    private final static String OUTPUT_FORMAT = "-";

    @Override
    public void printView(List<Integer> positions, List<String> names) {
        for (Integer position : positions) {

            printOne(position);
        }
        nextLine();
    }

    private void printName(String name) {
        System.out.print(name);
    }

    private void printOne(Integer position) {
        for (int i=0; i<position; i++)
            System.out.print(OUTPUT_FORMAT);
        nextLine();
    }

    private void nextLine() {
        System.out.println();
    }
}
