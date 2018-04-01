package racingcar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sangsik.kim
 */
public class GameRecord {
    private Map<Integer, List<Integer>> records;

    public GameRecord() {
        this.records = new HashMap<>();
    }

    public void save(Integer round, List<Integer> records) {
        this.records.put(round, records);
    }

    public List<Integer> load(Integer round) {
        return this.records.get(round);
    }

    public Map<Integer, List<Integer>> loadAll() {
        return this.records;
    }

    public void initialize() {
        this.records.clear();
    }
}
