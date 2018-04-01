package race;

import java.util.List;

interface Drawer {
    void draw(List<Recorder> recorders);
}

class LineDrawer implements Drawer {
    private static final String FORMAT = "-";

    @Override
    public void draw(List<Recorder> recorders) {
        for (Recorder recorder : recorders) {
            for (int i = 0; i < recorder.size(); i++) {
                printStraightUntil(recorder.getRecord(i));
                nextLine();
            }
            nextLine();
        }
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
