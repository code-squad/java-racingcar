package race.domain;

import java.util.ArrayList;
import java.util.List;

public class Recorder {
    private List<Integer> results = new ArrayList<>();

    public void record(int result) {
        results.add(result);
    }

    public int getRecord(int lab) {
        return results.get(lab);
    }

    public int getLastRecord() {
        if (size() == 0) {
            return 0;
        }
        return getRecord(size() - 1);
    }

    public int size() {
        return results.size();
    }

    public List<Integer> getRecords() {
        return results;
    }
}
