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

    int size() {
        return results.size();
    }
}
