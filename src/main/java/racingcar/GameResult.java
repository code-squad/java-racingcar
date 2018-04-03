package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        return this.records
                .stream()
                .filter(record -> record.matchPosition(getHighestRecord()))
                .collect(Collectors.toList());
    }

    private Record getHighestRecord() {
        return this.records
                .stream()
                .max(Record::compareTo)
                .get();
    }
}
