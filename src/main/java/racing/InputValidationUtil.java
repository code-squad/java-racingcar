package racing;

import java.util.stream.Stream;

public final class InputValidationUtil {

    private InputValidationUtil() {
    }

    public final static int MIN_COUNT = 1;
    public final static int MAX_COUNT = 100;
    public final static String SPLIT_SYMBOL = ",";

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