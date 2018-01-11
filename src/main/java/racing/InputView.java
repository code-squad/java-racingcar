package racing;

import java.util.Scanner;
import java.util.stream.Stream;

import static java.lang.String.format;

public final class InputView {

    private final static int MIN_COUNT = 1;
    private final static int MAX_COUNT = 100;
    private final static String SPLIT_SYMBOL = ",";

    private final int maxMoveCount;
    private final String[] names;

    public int getMaxMoveCount() {
        return maxMoveCount;
    }

    public String[] getNames() {
        return names;
    }

    private InputView (String[] names, int maxMoveCount) {
        this.names = names;
        this.maxMoveCount = maxMoveCount;
    }

    public static InputView getByUser() {
        return new InputView(inputCarNames(), inputMoveCount());
    }

    private static String[] inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return getNameByUser();
    }

    public static String[] getNameByUser() {
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        while (isInvalidNameInput(temp)) {
            System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
            temp = scanner.nextLine();
        }
        return temp.split(SPLIT_SYMBOL);
    }

    public static boolean isInvalidNameInput(String temp) {
        return isBlank(temp) ||
                noSplitSymbol(temp) ||
                hasBlankName(temp);
    }

    private static boolean hasBlankName(String temp) {
        return temp.split(SPLIT_SYMBOL).length == 0 ||
                Stream.of(temp.split(SPLIT_SYMBOL)).anyMatch(name->isBlank(name.trim()));
    }

    private static boolean noSplitSymbol(String temp) {
        return temp.indexOf(SPLIT_SYMBOL) == -1;
    }

    private static int inputMoveCount() {
        System.out.println(format("시도할 회수는 몇 회 인가요? %d~%d 사이의 숫자를 입력해주세요.", MIN_COUNT, MAX_COUNT));
        return getNumberByUser();
    }

    private static int getNumberByUser() {
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        while (isOutOfNumber(temp)) {
            System.out.println(format("%d-%d 사이의 숫자를 입력해주세요.", MIN_COUNT, MAX_COUNT));
            temp = scanner.nextLine();
        }
        return Integer.parseInt(temp);
    }

    public static boolean isOutOfNumber(String temp) {
        return isBlank(temp) ||
                !isNumeric(temp) ||
                isOutOfBound(temp);
    }

    private static boolean isBlank(String temp) {
        return temp == null || temp.isEmpty();
    }

    private static boolean isNumeric(String temp) {
        return temp.matches("^[0-9]*$");
    }

    private static boolean isOutOfBound(String temp) {
        return Integer.parseInt(temp) < MIN_COUNT || Integer.parseInt(temp) > MAX_COUNT;
    }
}