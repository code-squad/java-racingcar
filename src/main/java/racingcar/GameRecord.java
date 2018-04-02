package racingcar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sangsik.kim
 */
public class GameRecord {
    private Map<Integer, List<UserRecord>> records;

    public GameRecord() {
        this.records = new HashMap<>();
    }

    public void save(Integer round, List<UserRecord> records) {
        this.records.put(round, records);
    }

    public List<UserRecord> load(Integer round) {
        return this.records.get(round);
    }

    public Map<Integer, List<UserRecord>> loadAll() {
        return this.records;
    }

    public void initialize() {
        this.records.clear();
    }
}
