package racinggame.view;

import java.util.List;

public class DefaultRacingGameView implements RacingGameView {

    private final static String OUTPUT_FORMAT = "-";
    private final static String BLANK_FORMAT = " : ";

    @Override
    public void printView(List<String> names, List<Integer> positions) {
        for (int i=0; i<names.size(); i++) {
            printName(names.get(i));
            printPositionByOne(positions.get(i));
        }
        nextLine();
    }

    private void printName(String name) {
        System.out.print(name);
    }

    private void printPositionByOne(Integer position) {
        printBlank();
        for (int i=0; i<position; i++)
            System.out.print(OUTPUT_FORMAT);
        nextLine();
    }

    private void printBlank() {
        System.out.print(BLANK_FORMAT);
    }

    private void nextLine() {
        System.out.println();
    }
}
