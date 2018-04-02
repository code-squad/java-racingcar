package racingcar;

import java.util.List;
import java.util.StringJoiner;

/**
 * @author sangsik.kim
 */
public class PrintView {

    public static void print(GameResult gameResult) {
        List<Record> records = gameResult.get();
        for (Record userRecord : records) {
            System.out.println(userRecord.getName() + "\t: " + numberToHyphen(userRecord.getPosition()));
        }
        System.out.println();
    }

    public static void printWinners(GameResult gameResult) {
        System.out.println(stringJoining(gameResult.getWinners()) + "가 최종 우승했습니다.");
    }

    private static StringJoiner stringJoining(List<Record> records) {
        StringJoiner joiner = new StringJoiner(",");
        for (Record userRecord : records) {
            joiner.add(userRecord.getName());
        }
        return joiner;
    }

    private static String numberToHyphen(Integer position) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < position; i++) {
            result.append("-");
        }
        return result.toString();
    }
}
