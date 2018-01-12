package racing;

import java.util.Scanner;

import static java.lang.String.format;

final class InputView {

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
        while (InputValidationUtil.isInvalidNameInput(temp)) {
            System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
            temp = scanner.nextLine();
        }
        return temp.split(InputValidationUtil.SPLIT_SYMBOL);
    }

    private static int inputMoveCount() {
        System.out.println(format("시도할 회수는 몇 회 인가요? %d~%d 사이의 숫자를 입력해주세요.", InputValidationUtil.MIN_COUNT, InputValidationUtil.MAX_COUNT));
        return getNumberByUser();
    }

    private static int getNumberByUser() {
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        while (InputValidationUtil.isOutOfNumber(temp)) {
            System.out.println(format("%d-%d 사이의 숫자를 입력해주세요.", InputValidationUtil.MIN_COUNT, InputValidationUtil.MAX_COUNT));
            temp = scanner.nextLine();
        }
        return Integer.parseInt(temp);
    }
}