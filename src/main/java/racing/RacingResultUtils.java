package racing;

import spark.utils.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

public class RacingResultUtils {

    public static String getBestCarNames(List<RacingResult> results) {
        checkArgument(results);
        return getBestResults(results).stream()
                                      .map(RacingResult::getName)
                                      .collect(Collectors.joining(","));
    }

    public static List<RacingResult> getBestResults(List<RacingResult> results) {
        checkArgument(results);
        int biggestPosition = getBiggestPosition(results);
        return results.stream()
                      .filter(result -> result.getPosition() == biggestPosition)
                      .collect(Collectors.toList());
    }

    public static int getBiggestPosition(List<RacingResult> results) {
        checkArgument(results);
        return results.stream()
                      .mapToInt(RacingResult::getPosition)
                      .max().orElseThrow(IllegalStateException::new);
    }

    private static void checkArgument(List<RacingResult> results) {
        if (CollectionUtils.isEmpty(results)) {
            throw new IllegalArgumentException("result is empty");
        }
    }
}
