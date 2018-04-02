package race;

import java.util.ArrayList;
import java.util.List;

class Recorder {
    private List<Integer> results = new ArrayList<>();

    void record(int result) {
        results.add(result);
    }

    int getRecord(int lab) {
        return results.get(lab);
    }

    int getLastRecord() {
        if (size() == 0) {
            return 0;
        }
        return getRecord(size() - 1);
    }

    int size() {
        return results.size();
    }

    List<Integer> getRecords() {
        return results;
    }
}
