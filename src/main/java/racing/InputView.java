package racing;

import java.util.Scanner;

import static java.lang.String.format;

public final class InputView {

    private final static int MIN_COUNT = 1;
    private final static int MAX_COUNT = 100;

    private final int carCount;
    private final int maxMoveCount;

    public int getCarCount() {
        return carCount;
    }

    public int getMaxMoveCount() {
        return maxMoveCount;
    }

    private InputView (int carCount, int maxMoveCount) {
        this.carCount = carCount;
        this.maxMoveCount = maxMoveCount;
    }

    public static InputView getByUser() {
        return new InputView(inputCarCount(), inputMoveCount());
    }

    private static int inputCarCount() {
        System.out.println(format("자동차 대수는 몇 대 인가요? %d~%d 사이의 숫자를 입력해주세요.", MIN_COUNT, MAX_COUNT));
        return getNumberByUser();
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
            temp = scanner.nextLine().trim();
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