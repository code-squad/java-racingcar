package racingcar;

public class ResultView {
    public static void printStatus(int[] carPositions) {
        StringBuilder sb = new StringBuilder();
        for (int carNumber = 0; carNumber < carPositions.length; carNumber++) {
            sb.append(printMove(carPositions[carNumber]))
              .append("\n");
        }
        System.out.println(sb.toString());
    }

    static String printMove(int count) {
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < count; index++) {
            sb.append("-");
        }
        return sb.toString();
    }
}
