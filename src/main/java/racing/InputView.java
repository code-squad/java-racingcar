package racing;

import java.util.Scanner;

public class InputView {

    private static String inputCarNumber() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static String inputTimesNumber() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int getCarNumber() {

        try {
            return Integer.parseInt(inputCarNumber());
        } catch (NumberFormatException e) {
            System.out.println("숫자만 입력해 주세요!");
            inputCarNumber();
        }

        return -1;
    }

    public static int getTimesNumber() {

        try {
            return Integer.parseInt(inputTimesNumber());
        } catch (NumberFormatException e) {
            System.out.println("숫자만 입력해 주세요!");
            inputTimesNumber();
        }

        return -1;
    }

}
