package race;

import java.util.Map;
import java.util.stream.IntStream;

interface Drawer {
    void draw(Map<String, Recorder> records, int labs);
}

class LineDrawer implements Drawer {
    private static final String FORMAT = "-";
    private static final String NAME_PRINT_FORMAT = "%s: ";

    @Override
    public void draw(Map<String, Recorder> records, int labs) {
        IntStream.range(0, labs)
                .forEach(idx -> drawEachRecordsAt(records, idx));
    }

    private void drawEachRecordsAt(Map<String, Recorder> records, int idx) {
        records.forEach((k, v) -> {
            printName(k);
            printStraightUntil(v.getRecord(idx));
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
