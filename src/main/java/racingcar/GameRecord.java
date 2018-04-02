package racingcar;

import java.util.*;

/**
 * @author sangsik.kim
 */
public class GameRecord {
    private Map<Integer, List<UserRecord>> records;
    private List<UserRecord> winners;

    public GameRecord() {
        this.records = new HashMap<>();
    }

    public List<UserRecord> getWinners() {
        if (this.winners == null) {
            decisionWinners();
        }
        return this.winners;
    }

    // todo : 로직 개선이 필요함. 다른객체에게 역할을 주는게 나을까?
    private void decisionWinners() {
        if (records.isEmpty()) {
            throw new RuntimeException("저장된 기록이 없습니다.");
        }
        List<UserRecord> finalRoundRecord = load(this.records.size());
        Optional<UserRecord> maxRecord = finalRoundRecord.
                stream().
                max(UserRecord::compareTo);

        List<UserRecord> result = new ArrayList<>();
        for (UserRecord record : finalRoundRecord) {
            if (record.getRecord() == maxRecord.get().getRecord()) {
                result.add(record);
            }
        }
        this.winners = result;
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
