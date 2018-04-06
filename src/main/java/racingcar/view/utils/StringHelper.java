package racingcar.view.utils;

import racingcar.domain.Record;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * @author sangsik.kim
 */
public class StringHelper {
    private static final String DEFAULT_PROGRESS_CHARACTER = "-";

    public static List<String> createProgressString(List<Record> records) {
        return createProgressString(records, DEFAULT_PROGRESS_CHARACTER);
    }

    public static List<String> createProgressString(List<Record> records, final String character) {
        return records
                .stream()
                .map(record -> record.getName() + "\t: " + numberToCharacter(record.getPosition(), character))
                .collect(Collectors.toList());
    }

    public static String createWinnersString(List<Record> records) {
        List<String> names = records.stream()
                .map(Record::getName)
                .collect(Collectors.toList());
        return stringJoining(names);
    }

    private static String stringJoining(List<String> strings) {
        StringJoiner joiner = new StringJoiner(",");
        for (String string : strings) {
            joiner.add(string);
        }
        return joiner.toString();
    }

    private static String numberToCharacter(Integer position, String character) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < position; i++) {
            result.append(character);
        }
        return result.toString();
    }
}
