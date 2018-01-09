package car;

import java.util.List;
import java.util.stream.IntStream;

public class RacingUtils {
    public static final String REGEX = ",";
    public static final String SPACE = " ";
    public static final String RESULT_UI = "&nbsp;&nbsp;&nbsp;&#128652;";
    private static final String GO = "-";
    private static final String UI_FORMAT = "%s : %s";
    private static final String WINNER_FORMAT = "%s가 최종 우승했습니다.";

    public static void printRacingUi(List<Car> cars) {
        cars.stream().forEach(car -> System.out.println(racingFormatting(car)));
    }

    public static String racingFormatting(Car car) {
        return String.format(UI_FORMAT, car.getName(), appendResultToString(car.getMove()));
    }

    public static String resultFormatting(String result) {
        return String.format(WINNER_FORMAT, result);
    }

    public static String appendResultToString(int move) {
        StringBuilder builder = new StringBuilder();
        IntStream.range(0, move).forEach(i -> builder.append(GO));
        return builder.toString();
    }
}
