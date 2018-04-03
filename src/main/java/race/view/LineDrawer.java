package race.view;

import race.domain.RaceCar;

import java.util.List;
import java.util.stream.IntStream;

public class LineDrawer implements Drawer {
    private static final String FORMAT = "-";
    private static final String NAME_PRINT_FORMAT = "%s: ";

    public void draw(List<RaceCar> cars, int labs) {
        IntStream.range(0, labs).forEach(idx -> 
                drawEachRecordsAt(cars, idx));
    }

    private void drawEachRecordsAt(List<RaceCar> raceCars, int idx) {
        raceCars.forEach(c -> {
            printName(c.getRacer());
            printStraightUntil(c.getRecorder().getRecord(idx));
            nextLine();
        });
        nextLine();
    }

    private void printName(String name) {
        System.out.print(String.format(NAME_PRINT_FORMAT, name));
    }

    private void printStraightUntil(int until) {
        for (int i = 0; i < until; i++) {
            System.out.print(FORMAT);
        }
    }

    private void nextLine() {
        System.out.println();
    }
}
