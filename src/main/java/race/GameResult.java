package race;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class GameResult {
    private Map<String, Recorder> records;
    private List<String> winners;

    GameResult(Map<String, Recorder> records) {
        this.records = records;
        this.winners = decideWinners();
    }

    List<String> getWinners() {
        return winners;
    }

    private List<String> decideWinners() {
        Map<String, Integer> lastResults = records.entrySet().stream()
                .collect(Collectors.toMap(
                        e -> e.getKey(),
                        e -> e.getValue().getLastRecord()));

        int bestResult = getBestResult(lastResults);

        return getNamesByResult(lastResults, bestResult);
    }

    private int getBestResult(Map<String, Integer> records) {
        return records.values().stream()
                .max(Comparator.naturalOrder()).get();
    }

    private List<String> getNamesByResult(Map<String, Integer> finalRecords, int result) {
        return finalRecords.entrySet().stream()
                .filter(e -> e.getValue() == result)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}

