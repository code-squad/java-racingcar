package racingcar;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sangsik.kim
 */
public class GameResult {
    private List<Record> records;

    public GameResult(List<Record> records) {
        this.records = records;
    }

    public GameResult() {
        this(new ArrayList<>());
    }

    public void add(Record userRecord) {
        this.records.add(userRecord);
    }

    public List<Record> get() {
        return this.records;
    }

    public List<Record> getWinners() {
        if (this.records == null) {
            throw new RuntimeException("게임 기록이 존재하지 않습니다.");
        }
        Record maxRecord = this.records.stream().max(Record::compareTo).get();
        List<Record> winners = new ArrayList<>();
        for (Record record : records) {
            if (record.getPosition() == maxRecord.getPosition()) {
                winners.add(record);
            }
        }
        return winners;
    }
}
